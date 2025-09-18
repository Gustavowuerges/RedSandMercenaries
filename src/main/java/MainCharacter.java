package main.java;
import main.java.*;

public abstract class MainCharacter extends GlobalStatus {

    public String name;
    public String className;

    public MainCharacter(String className, int health, int strength, int dexterity, int fortitude, int faith, int inteligence) {
        super(health, strength, dexterity, fortitude, faith, inteligence);
        this.className = className;
    }

    public void displayClassStatus() {
        super.showStatus();
    }

}

    public abstract void Description();
}

