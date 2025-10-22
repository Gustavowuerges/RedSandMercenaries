package main.java.Entities.Jobs;
import main.java.Entities.Job;

public class Mage extends Job {

    public Mage() {
        super("Mage", 2, 4, 2, 6, 10);
    }

    public void description() {
        System.out.println("Masters of the arcane, weaving spells that can twist reality itself.\n" +
                           "They study tirelessly, for every incantation carries both power and peril.");
    } 
}