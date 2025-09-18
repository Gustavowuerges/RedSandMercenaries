package main.java.Origin;
import main.java.GlobalStatus;
import main.java.MainCharacter;

public class Fighter extends MainCharacter {

    public void Description() { 
        System.out.println( "Sob o sol inclemente do deserto, caminha o guerreiro de braços firmes e olhos frios.\n" +
                 "Cada golpe que desferem é marcado pelo suor e pelo sangue das areias,\n" +
                 "e cada passo deixa uma sombra que parece mais pesada que a própria morte.");
        return;
    }
    public Fighter() {
        super("Fighter",12, 3, 9, 3, 4, 4);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}