package main.java;
import main.java.*;

public class Entity extends GlobalStatus {

    public String name;
    public String className;

    public Entity(String name, String className, int health, int strength, int dexterity, int fortitude, int faith, int inteligence) {
        super(name, health, strength, dexterity, fortitude, faith, inteligence);
        this.className = className;
        this.name = name;
    }

    public void displayClassStatus() {
        super.showClassStatus();
    }

    public void Description() {
    }
}