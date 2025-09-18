package main.java.game;
import main.java.Origin.*;
import main.java.MainCharacter;
import java.util.Scanner;

import javax.swing.Action;

public class JobSelection {
    public static void main(String[] args) throws InterruptedException {
        Scanner keybodard = new Scanner(System.in);
        public void textEffect(String text) {
         for (char c : text.toCharArray()) {
            System.out.print(c);   
            Thread.sleep(10);      
            }
        }
    
       


        int option = keyboard.nextInt();
        MainCharacter chosenClass = null; // polimorfismo aqui

        do {
            
        } while (chosenClass == null);

        // chama a descrição da classe escolhida
        System.out.println(chosenClass.className);
        chosenClass.displayClassStatus();
        chosenClass.Description();
    }
}