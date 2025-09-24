package main.java.game;

import java.util.Scanner;
import main.java.game.*;

public class Menu {
    public void StartMenu() {

        JobSelection jobSelection = new JobSelection();
        GameStart gameStart = new GameStart();
        Scanner keyboard = new Scanner(System.in);
        String[] arr = {"Start", "Options"};
        String pointer = ">";
        int selectedIndex = 0;

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int i = 0; i < arr.length; i++) {
                if (i == selectedIndex) {
                    System.out.println(pointer + " " + arr[i]);
                } else {
                    System.out.println("  " + arr[i]);
                }
            }

            String input = keyboard.nextLine();

            if (input.equals("w")) {
                selectedIndex = (selectedIndex - 1 + arr.length) % arr.length; 
            } else if (input.equals("s")) {
                selectedIndex = (selectedIndex + 1) % arr.length; 
            } else if (input.equals("e")) {
                System.out.println("You selected: " + arr[selectedIndex]);
                break;
            } else if (input.equals("q")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }

        if (selectedIndex == 0) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else if (selectedIndex == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Dificuldade: Normal \nGráficos: Ultra");
        }
    }
}