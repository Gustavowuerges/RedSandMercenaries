package main.java.Entities;
import main.java.*;

public abstract class Player extends GlobalStatus {
    Job job;
    public String name;
    public String className;

    public Player(String name, String className, double hp, double mp, double str, double dex, double fort, double fth, double intel) {
        super(hp, mp, str, dex, fort, fth, intel);
    }

    public void defineStatus() {
        if(job != null) {
            setGlobalSTR(job.getSTR());
            setGlobalDEX(job.getDEX());
            setGlobalFORT(job.getFORT());
            setGlobalINTEL(job.getINTEL());
            setGlobalFAITH(job.getFTH());
            setGlobalHP(job.getFORT() * 5);
            setGlobalMP((job.getFTH() + job.getINTEL()) * 0.5);

        }
    }

    public void displayStatus() {
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String CYAN = "\u001B[36m";
        final String MAGENTA = "\u001B[35m";
    
        System.out.println(CYAN + "================ JOB STATUS ================" + RESET);
        System.out.println(YELLOW + "STR: " + RESET + RED + getGlobalSTR() + RESET + " | " + 
                           YELLOW + "DEX: " + RESET + GREEN + getGlobalDEX() + RESET + 
                           " | " + YELLOW + "INT: " + RESET + CYAN + getGlobalINTEL() + RESET);
        System.out.println(YELLOW + "FORT: " + RESET + MAGENTA + getGlobalFORT() + RESET + 
                           " | " + YELLOW + "FTH: " + RESET + GREEN + getGlobalFAITH() + RESET);
        System.out.println(CYAN + "===========================================" + RESET);
    
        // ASCII template simples de barras de status
        System.out.println("  [STR] " + "=".repeat((int)getGlobalSTR()) + ">");
        System.out.println("  [DEX] " + "=".repeat((int)getGlobalDEX()) + ">");
        System.out.println("  [INT] " + "=".repeat((int)getGlobalINTEL()) + ">");
        System.out.println("  [FORT] " + "=".repeat((int)getGlobalFORT()) + ">");
        System.out.println("  [FTH] " + "=".repeat((int)getGlobalFAITH()) + ">");
    }
}