package main.java.game;
import main.java.Origin.*;
import main.java.MainCharacter;
import java.util.Scanner;
import javax.swing.Action;

public class JobSelection {

    public void textEffect(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
           System.out.print(c);   
           Thread.sleep(10);      
           }
           return;
       }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MainCharacter chosenClass = null; // polimorfismo aqui
        int i = 0;

        MainCharacter[] classes = {
            new Archer(),
            new Cultist(),
            new Fighter(),
            new Guardian(),
            new Oracle(),
            new Thief()
        };

        while (chosenClass == null) {
            System.out.println("Press 'a' or 'd' to browse the classes! And when you want to choose, press 'e'!\n");
            System.out.println(classes[i].className);
            classes[i].displayClassStatus();
            classes[i].Description();
            System.out.println("(" + (i + 1) + "/" + classes.length +")");
            String input = keyboard.nextLine();
            
            if(input.equals("a")) { 
              i = (i - 1 + classes.length) % classes.length;
            } else if (input.equals("d")) {
              i = (i + 1) % classes.length;
            } else if(input.equals("e")) {
                chosenClass = classes[i];
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }      
    }
}