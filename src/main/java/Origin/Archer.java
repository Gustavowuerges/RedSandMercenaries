package main.java.Origin;
import main.java.MainCharacter;

public class Archer extends MainCharacter {

    public void Description() {
        System.out.println("Entre as dunas vermelhas que parecem engolir o horizonte,\n" +
                "há aqueles cujas flechas cortam o vento antes que a mente perceba.\n" +
                "Dizem que seus disparos carregam o silêncio da morte.");
        return;
    } 


    public Archer() {
        super("Archer",12, 3, 9, 3, 4, 4);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}