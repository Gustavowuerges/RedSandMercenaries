package main.java.Entities.Jobs;
import main.java.Entities.Job;

public class Swordsman extends Job {

    public Swordsman() {
        super("Swordsman", 7, 6, 5, 3, 2);
    }

    public void description() {
        System.out.println("Trained from youth to master the blade, swift and precise.\n" +
                           "Every strike is a dance, every parry a testament to skill.");
    } 
}