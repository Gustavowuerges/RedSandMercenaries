package main.java.Features.Map;

import main.java.Entities.Player;
import main.java.Entities.Enemies.Enemy;
import java.util.Scanner;

public class Map {
    Scanner keyboard = new Scanner(System.in);
    Player p = new Player("Player", null);
    Enemy enemy = new Enemy(4, 3); // cria o inimigo
    String input;

    char[][] dungeon = {
        "###############".toCharArray(),
        "#.....#.......#".toCharArray(),
        "#.....#.......#".toCharArray(),
        "#.P..#####...#".toCharArray(),
        "#.........#...#".toCharArray(),
        "#####.#####...#".toCharArray(),
        "#.....#.......#".toCharArray(),
        "#.....#########".toCharArray(),
        "#.............#".toCharArray(),
        "###############".toCharArray()
    };

    public void grid() {
        p.setPlayerX(2);
        p.setPlayerY(3);

        enemy.setPlayer(p); // precisamos informar o player pro inimigo
        enemy.setPosition(9, 8); // posição inicial do inimigo

        while(true) { 
            int nextY = p.getPlayerY();
            int nextX = p.getPlayerX();

            // Limpa o mapa de posições móveis
            for (int y = 0; y < dungeon.length; y++) {
                for (int x = 0; x < dungeon[y].length; x++) {
                    if (dungeon[y][x] != '#') {
                        dungeon[y][x] = '.';
                    }
                }
            }

            // Atualiza posições
            dungeon[p.getPlayerY()][p.getPlayerX()] = 'P';
            dungeon[enemy.getY()][enemy.getX()] = 'E';

            // Mostra mapa
            for(int i = 0; i < dungeon.length; i++) {
                System.out.println(dungeon[i]);
            }

            // Input do player
            System.out.print("> ");
            input = keyboard.nextLine().toLowerCase();

            switch(input) {
                case "w": nextY--; break;
                case "s": nextY++; break;
                case "a": nextX--; break;
                case "d": nextX++; break;
            }

            // Move player se não bater na parede
            if (dungeon[nextY][nextX] != '#') {
                p.setPlayerX(nextX);
                p.setPlayerY(nextY);
            }

            // Atualiza inimigo via FSM
            enemy.update(dungeon);

            // Limpa terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
