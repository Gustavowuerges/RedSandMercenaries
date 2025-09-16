package main.java.Origin;
import main.java.GlobalStatus;;

public class Guardian extends GlobalStatus {
    public void Description() {  
        System.out.println("O escudo levantado, a figura se ergue como muralha contra horrores\n" +
                  "que rastejam sob a areia vermelha.\n" +
                  "É o guardião silencioso, que mantém o inimigo à distância,\n" +
                  "mas cujo próprio coração sente a fúria e a desolação do deserto pulsando ao redor.");
    return;
    }

    public Guardian() {
        super(12, 3, 9, 3, 4, 4);
    }
}