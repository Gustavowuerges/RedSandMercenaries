package main.java.Origin;
import main.java.GlobalStatus;

public class Archer extends GlobalStatus {

    public void Description() {
        System.out.println("Entre as dunas vermelhas que parecem engolir o horizonte,\n" +
                "há aqueles cujas flechas cortam o vento antes que a mente perceba.\n" +
                "Dizem que seus disparos carregam o silêncio da morte.");
        return;
    } 


    public Archer() {
        super(12, 3, 9, 3, 4, 4);
    }
}