package main.java.Entities;
import main.java.Entities.Player;
import main.java.Entities.Job;
import main.java.Entities.Jobs.*;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Action;

public class CharacterCreator {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Job> jobs = new ArrayList<>();

    public void creator() { 
        jobs.add(new Archer());
        System.out.println("Tell me, what's your name roamer of the red sands?");
        String name = keyboard.nextLine();
        while (true) {

        }
    }
}