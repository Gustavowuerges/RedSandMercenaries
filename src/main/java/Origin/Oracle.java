package main.java.Origin;
import main.java.MainCharacter;

public class Oracle extends MainCharacter {
    public void Description() {  
        System.out.println("Amid sandstorms and mirages that confuse the sight,\n" +
                            "the Oracle contemplates the inevitable.\n" +
                            "Each vision carries the weight of secrets that corrode the mind,\n" +
                            "and each step is guided by destinies no mortal would dare defy.");
    return;
    }
    public Oracle(String name) {
        super("","Oracle", 4, 2, 3, 4, 8, 9);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}