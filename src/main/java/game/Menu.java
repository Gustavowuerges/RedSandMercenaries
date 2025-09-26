package main.java.game;
import main.java.game.JobSelection;
import java.util.Scanner;

public class Menu {
    JobSelection jobSelection = new JobSelection();
    Scanner keyboard = new Scanner(System.in);
    String[] display = {"Start", "Option"};
    String icon = ">";
    int indexPosition = 0;
    boolean running = true;

    public void StartMenu() {
    while (running) {
        System.out.println("");
        DisplayMenu();
        HandleInput();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
    }

    private void DisplayMenu() {
        for (int i = 0; i < display.length; i++) {
            if (i == indexPosition) {
                System.out.println(icon + " " + display[i]);
            } else {
                System.out.println(" " + display[i]);
            }
        }
    }

    private void HandleInput() {
        String input = keyboard.next();
        
        switch (input) {
            case "w":
            indexPosition = (indexPosition - 1 + display.length) % display.length;
                break;
        
            case "s":
            indexPosition = (indexPosition + 1) % display.length;
                break;
            
            case "e": 
                ExecuteOption();
                break;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void ExecuteOption() {
        
        if (indexPosition == 0) {
        } else if (indexPosition == 1) {
            System.out.println("Dificuldade: Normal");
        }
        running = false;
    }
}