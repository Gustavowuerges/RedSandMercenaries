package main.java.game;
import main.*;
import main.java.Origin.Archer;
import main.java.Origin.Cultist;
import main.java.Origin.Fighter;
import main.java.Origin.Guardian;
import main.java.Origin.Oracle;
import main.java.Origin.Thief;

import java.util.Scanner;

public class JobSelection {
    public static void main(String[] args) throws InterruptedException {
        //Tornando Classes em Objetos
        Fighter fighter = new Fighter();
        Thief thief = new Thief();
        Archer archer = new Archer();
        Guardian guardian = new Guardian();
        Cultist cultist = new Cultist();
        Oracle oracle = new Oracle();

        //Description do JobSelection
        Scanner keyboard = new Scanner(System.in);
        String selectionText = "No coração do deserto, onde o vento molda dunas eternas e o sol inclemente testa a coragem dos homens, apenas os mais fortes sobrevivem. Mercenários vindos de terras distantes se reúnem sob a bandeira da areia vermelha, cada um com sua arte de guerra, sua honra — ou sua ganância. Escolha com sabedoria: sua classe será sua identidade diante da vastidão árida e dos inimigos que a espreitam nas sombras das caravanas, dos oásis e das ruínas esquecidas.";
        
        for (char c : selectionText.toCharArray()) {
            System.out.print(c);   
            Thread.sleep(10);      
        }

        System.out.println("\n1. [Fighter]" + "\n2. [Guardian] " + "\n3. [Thief] " + "\n4. [Archer]" + "\n5. [Cultist] " + "\n6. [Oracle]");
        
        int option = keyboard.nextInt();
        

        switch (option) {
            case 1:
                fighter.Description();
                break;
        
            case 2:
                guardian.Description();
                break;

            case 3:
                thief.Description();
                break;

            case 4:      
                archer.Description();
                break;

            case 5:   
                cultist.Description();
                break;
            
            case 6:      
                oracle.Description();
                break;
        }
    }
}
