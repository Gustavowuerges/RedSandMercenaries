package main.java.Origin;
import main.java.GlobalStatus;;

public class Thief extends GlobalStatus {
    public void Description() { 
        System.out.println("Ágil como o vento que varre as dunas, move-se nas sombras\n" +
               "e nos espaços esquecidos pelo sol.\n" +
               "Leva consigo tudo que a morte ainda não reclamou,\n" +
               "deixando apenas o rastro de incerteza e o sussurro de sua presença entre as areias vermelhas.");
    return;
    }

    public Thief() {
        super(12, 3, 9, 3, 4, 4);
    }
}