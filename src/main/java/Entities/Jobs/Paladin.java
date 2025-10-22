package main.java.Entities.Jobs;
import main.java.Entities.Job;

public class Paladin extends Job {

    public Paladin() {
        super("Paladin", 6, 4, 6, 6, 3);
    }

    public void description() {
        System.out.println("Champions of light, armored in righteousness.\n" +
                           "They fight not for glory, but to protect the innocent and uphold justice.");
    } 
}