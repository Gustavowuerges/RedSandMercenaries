package main.java.game;

import java.util.Scanner;

import main.java.Map.AsciiMap;
import main.java.Map.MapGrid;
import main.java.Map.MapRender;


public class game {
    MapGrid overworld;
    int pL = 2, pC = 1; // possição inicial

    public game(){
        overworld = new MapGrid(10, 5 , '▒');
        overworld.tiles[2][3] = '█';
        overworld.visited[pL][pC] = true;
    }

    public void ready(){
        Scanner Keyboard = new Scanner(System.in);
        String cmd;
        System.out.println("Digite 'mapa' para ver o mapa ou 'sair' para sair");

        while (true){
            System.out.println("> ");
            cmd = Keyboard.nextLine();

            if(cmd.equalsIgnoreCase("mapa")){
                AsciiMap.ShowMap("Map.txt", 120);
            }else if(cmd.equalsIgnoreCase("mapa mini")){
                MapRender.printMinimap(overworld, pL, pC);
            }else if (cmd.equalsIgnoreCase("sair")) {
                System.out.println("saindo...");
                break;
            }else{
                System.out.println("Comando desconhecido.");
            }
        }
        Keyboard.close();
    }
}
