package main.java.Origin;
import main.java.Entity;

public class Thief extends Entity {
    public void Description() { 
        System.out.println("Agile as the wind that sweeps the dunes, it moves through shadows\n" +
                            "and in spaces forgotten by the sun.\n" +
                            "It carries with it all that death has yet to claim,\n" +
                            "leaving only a trail of uncertainty and the whisper of its presence among the red sands.");
    return;
    }

    public Thief(String name) {
        super(name,"Thief", 4, 4, 10, 3, 5, 4);
    }

    public void displayClassStatus() {
        super.showClassStatus();
    }

}