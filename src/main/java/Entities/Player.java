package main.java.Entities;
import main.java.*;

public class Player extends GlobalStatus {
    Job job;
    public String name;
    public String className;

    public Player(String name, Job job) {
        super(1, 0, 0, 0, 0, 0, 0, 0, 0);
        this.name = name;
        this.className = job.getJOBNAME();
        this.job = job;
        defineStatus();
    }


    public void movement() {
        
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
    
        // Nome da classe/job
        String jobName = (job != null) ? job.getJOBNAME() : "Nenhuma";
    
        System.out.println(CYAN + "================ PLAYER STATUS ================" + RESET);
        System.out.println(YELLOW + "Classe: " + RESET + jobName);
        System.out.println(YELLOW + "STR: " + RESET + RED + getGlobalSTR() + RESET +
                           " | DEX: " + RESET + GREEN + getGlobalDEX() + RESET +
                           " | INT: " + RESET + CYAN + getGlobalINTEL() + RESET);
        System.out.println(YELLOW + "FORT: " + RESET + MAGENTA + getGlobalFORT() + RESET +
                           " | FTH: " + RESET + GREEN + getGlobalFAITH() + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
    
        // Barras simples
        int maxBar = 20;
        System.out.println("  [STR] " + "=".repeat(Math.max(1, (int)getGlobalSTR())) + ">");
        System.out.println("  [DEX] " + "=".repeat(Math.max(1, (int)getGlobalDEX())) + ">");
        System.out.println("  [INT] " + "=".repeat(Math.max(1, (int)getGlobalINTEL())) + ">");
        System.out.println("  [FORT] " + "=".repeat(Math.max(1, (int)getGlobalFORT())) + ">");
        System.out.println("  [FTH] " + "=".repeat(Math.max(1, (int)getGlobalFAITH())) + ">");
    }

    
}