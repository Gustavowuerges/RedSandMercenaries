package main.java.game;

import main.java.Origin.*;
import main.java.Entity;
import main.java.GlobalStatus;

import java.util.Scanner;
import main.java.game.*;

public class JobSelection {
    public Entity startSelection(String name) {
        GameStart gameStart = new GameStart();
        Scanner keyboard = new Scanner(System.in);
        Entity chosenClass = null;
        int i = 0;

        Entity[] classes = {
            new Archer(name),
            new Cultist(name),
            new Fighter(name),
            new Guardian(name),
            new Oracle(name),
            new Thief(name)
        };
    
        while (chosenClass == null) {
            System.out.println("Press 'a' or 'd' to browse the classes! And when you want to choose, press 'e'!\n");
            System.out.println(classes[i].getClassName());
            classes[i].displayClassStatus();
            classes[i].Description();
            System.out.println("(" + (i + 1) + "/" + classes.length + ")");
            String input = keyboard.nextLine();

            if (input.equals("a")) {
                i = (i - 1 + classes.length) % classes.length;
            } else if (input.equals("d")) {
                i = (i + 1) % classes.length;
            } else if (input.equals("e")) {
                chosenClass = classes[i];
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
        return chosenClass;
        
    }
}