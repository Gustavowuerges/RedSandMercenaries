package main.java.Events.principalEvents;

import java.time.*;

import main.java.Events.RealEvents;

public class MarketDay implements RealEvents {
    private static final ZoneId ZONA = ZoneId.of("America/Sao_Paulo");
    private static final LocalTime START = LocalTime.of(18,0);
    private static final LocalTime END = LocalTime.of(18, 50);

    public String eventName(){
        return "Market Day!";
    }

    public boolean ruinIt(Clock clock){
        ZonedDateTime now = ZonedDateTime.now(clock).withZoneSameInstant(ZONA);
        LocalTime t = now.toLocalTime();

        return !t.isBefore(START) && !t.isAfter(END);
    }

    public void Execute(){
        System.out.println("Market Day is here — trade, bargain, and prosper!");
    }
}
