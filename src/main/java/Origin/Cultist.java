package main.java.Origin;
import main.java.MainCharacter;

public class Cultist extends MainCharacter {

    public void Description() { 
        System.out.println("Nos labirintos de ruínas esquecidas e enterradas pela areia,\n" +
                    "sussurros antigos serpenteiam entre pedras e ossos.\n" +
                    "Ali, o cultista invoca forças que a mente humana não deveria conhecer,\n" +
                    "moldando a carne e a alma de quem ousa se aproximar.");
        return;
    }

    public Cultist() {
        super("Cultist",12, 3, 9, 3, 4, 4);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}