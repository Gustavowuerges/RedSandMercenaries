package main.java.game;
import main.java.*;
import main.java.Origin.*;
import java.util.Scanner;

public class GameStart {
    public String name;
    public void start() {
        Menu menu = new Menu();
        Scanner keyboard = new Scanner(System.in);

        menu.StartMenu(); 
        System.out.println("Welcome to the red dunes wanderer...tell me, who are you? >");
        name = keyboard.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        JobSelection jobSelection = new JobSelection();
        Entity player = jobSelection.startSelection(name);
        
    }
}