package main.java.Features.Map;

import main.java.Entities.Player;
import main.java.Entities.Jobs.Archer;
import main.java.Entities.CharacterCreator;
import main.java.Entities.Job;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {
    Scanner keyboard = new Scanner(System.in);
    Player p = new Player("Player", null);
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
        "#........E....#".toCharArray(),
        "###############".toCharArray()
    };

    public void grid() {
        p.setPlayerX(2);
        p.setPlayerY(3);
        
        while(true) { 
            int nextY = p.getPlayerY();
            int nextX = p.getPlayerX();

            for(int i = 0; i < dungeon.length; i++) {
                System.out.println(dungeon[i]);
                }
                
            System.out.print("> ");
            input = keyboard.nextLine().toLowerCase();

            switch(input) {
                case "w": nextY--; break;
                case "s": nextY++; break;
                case "a": nextX--; break;
                case "d": nextX++; break;
            }

            if (dungeon[nextY][nextX] != '#') {
                dungeon[p.getPlayerY()][p.getPlayerX()] = '.';
                p.movement(input);
                p.setPlayerX(nextX);
                p.setPlayerY(nextY);
            } 
            dungeon[p.getPlayerY()][p.getPlayerX()] = 'P';
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}