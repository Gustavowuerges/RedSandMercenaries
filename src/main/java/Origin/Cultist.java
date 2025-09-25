package main.java.Origin;
import main.java.Entity;

public class Cultist extends Entity {

    public void Description() { 
        System.out.println("In the labyrinths of ruins forgotten and buried by the sand, \n" +
                           "ancient whispers slither among stones and bones. \n" +
                           "There, the cultist summons forces that the human mind should not know, \n" +
                           "shaping the flesh and soul of those who dare to approach.");
        return;
    }

    public Cultist(String name) {
        super(name,"Cultist",4, 3, 4, 4, 8, 8);
    }

    public void displayClassStatus() {
        super.showClassStatus();
    }
}