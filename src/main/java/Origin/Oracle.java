package main.java.Origin;
import main.java.MainCharacter;

public class Oracle extends MainCharacter {
    public void Description() {  
        System.out.println("Entre tempestades de areia e miragens que confundem a visão,\n" +
                "o oráculo contempla o inevitável.\n" +
                "Cada visão carrega o peso de segredos que corroem a sanidade,\n" +
                "e cada passo é guiado por destinos que nenhum homem ousaria desafiar.");
    return;
    }
    public Oracle() {
        super("Oracle", 12, 3, 9, 3, 4, 4);
    }

    public void displayClassStatus() {
        super.showStatus();
    }
}