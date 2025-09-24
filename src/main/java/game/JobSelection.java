package main.java.game;

import main.java.Origin.*;
import main.java.MainCharacter;
import java.util.Scanner;

public class JobSelection {

    public Object chosenClass;

    public void textEffect(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(10);
        }
    }

    public MainCharacter startSelection() {
        Scanner keyboard = new Scanner(System.in);
        MainCharacter chosenClass = null;
        String name = "";
        int i = 0;

        MainCharacter[] classes = {
            new Archer(name),
            new Cultist(name),
            new Fighter(name),
            new Guardian(name),
            new Oracle(name),
            new Thief(name)
        };
        
        name = keyboard.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (chosenClass == null) {
            System.out.println("Press 'a' or 'd' to browse the classes! And when you want to choose, press 'e'!\n");
            System.out.println(classes[i].className);
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
                chosenClass.name = name;
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        return chosenClass;
        
    }
}