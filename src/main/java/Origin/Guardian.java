package main.java.Origin;
import main.java.MainCharacter;

public class Guardian extends MainCharacter {
    public void Description() {  
        System.out.println("Those of unwavering will and utmost honour, the Guardians rise as living bulwarks upon the endless crimson sands.\n" + 
                           "Silent and resolute, they repel the relentless forces that stir beneath the desert,\n" +
                           "and the desert’s own fury flows through them, forging endurance and strength that no challenge can break.");
    return;
    }

    public Guardian(String name) {
        super("","Guardian",7, 6, 3, 8, 3, 3);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}