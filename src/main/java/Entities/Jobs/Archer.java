package main.java.Entities.Jobs;
import main.java.Entities.Job;

public class Archer extends Job {

    public Archer(double str, double dex, double fort, double fth, double intel) {
        super("Archer", str, dex, fort, fth, intel);
    
    }

    public void description() {
        System.out.println("Among the red dunes that seem to swallow the horizon,\n" +
                           "there are those whose arrows slice through the wind before the mind can notice.\n" +
                           "They say their shots carry the silence of death.");
        return;
    } 
}