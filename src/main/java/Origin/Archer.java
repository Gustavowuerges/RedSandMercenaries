package main.java.Origin;
import main.java.Entity;

public class Archer extends Entity {

    public void Description() {
        System.out.println("Among the red dunes that seem to swallow the horizon,\n" +
                           "there are those whose arrows slice through the wind before the mind can notice.\n" +
                           "They say their shots carry the silence of death.");
        return;
    } 


    public Archer(String name) {
        super(name,"Archer",5, 4, 9, 4, 4, 4);
    }

    public void displayClassStatus() {
        super.showClassStatus();
    }

    
}