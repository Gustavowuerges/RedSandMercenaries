package main.java.Entities;
import main.java.*;

public class Player extends GlobalStatus {
    Job job;
    private int playerX = 0;
    private int playerY = 0;
    public String name;
    public String className;

    public Player(String name, Job job) {
        super(1, 0, 0, 0, 0, 0, 0, 0, 0);
        this.name = (name != null) ? name : "Unknown";
        if (job != null) {
            this.job = job;
            this.className = job.getJOBNAME();
            defineStatus();
        } else {
            this.job = null;
            this.className = "NoClass";
        }
    }


    public void movement(String input) {
        String up = "w";
        String down = "s";
        String left = "a";
        String right = "d";

        if(input.equals(up)) {
            playerY--;
        } else if(input.equals(down)) {
            playerY++;
        } else if(input.equals(left)) {
            playerX--;
        } else if(input.equals(right)) {
            playerX++;
        }
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

    //Getters e Setters
    public int getPlayerX() {return playerX;}
    public int getPlayerY() {return playerY;}
    public void setPlayerX(int playerX) {this.playerX = playerX;}
    public void setPlayerY(int playerY) {this.playerY = playerY;}
}