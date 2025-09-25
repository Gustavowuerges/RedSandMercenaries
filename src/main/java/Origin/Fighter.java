package main.java.Origin;
import main.java.Entity;

public class Fighter extends Entity {

    public void Description() { 
        System.out.println( "Under the harsh desert sun walks the warrior with steady arms and cold eyes. \n" +
                            "Every strike they deliver is marked by the sweat and blood of the sands,\n " +
                            "and each step leaves a shadow that feels heavier than death itself.");
        return;
    }
    public Fighter(String name) {
        super(name,"Fighter",6, 7, 5, 6, 3, 3);
    }

    public void displayClassStatus() {
        super.showClassStatus();
    }
}