package main.java.Entities.Jobs;
import main.java.Entities.Job;

public class Warrior extends Job {

    public Warrior() {
        super("Warrior", 9, 5, 8, 2, 1);
    }

    public void description() {
        System.out.println("Mighty combatants, relying on brute strength and endurance.\n" +
                           "They charge into battle without hesitation, fearlessly facing any foe.");
    } 
}