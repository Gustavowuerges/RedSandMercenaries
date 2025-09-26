package main.java.Events;
import java.time.Clock;

public interface RealEvents {

    public String eventName();
    public boolean ruinIt(Clock c);
    public void Execute();
    
}
