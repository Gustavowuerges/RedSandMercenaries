package main.java.Entities;

public class GlobalStatus {
    // Atributos Modificadores Globais
    private double globalHP;
    private double globalMP;
    private double globalLVL;
    private double globalEXP;
    private double globalSTR;
    private double globalDEX;
    private double globalFORT;
    private double globalFAITH;
    private double globalINTEL;

    public GlobalStatus(double globalLVL, double globalEXP, double globalHP, double globalMP, double globalSTR, double globalDEX, double globalFORT, double globalFAITH, double globalINTEL) {
        this.globalLVL = globalLVL;
        this.globalEXP = globalEXP;
        this.globalHP = globalHP;
        this.globalMP = globalMP;
        this.globalSTR = globalSTR;
        this.globalDEX = globalDEX;
        this.globalFORT = globalFORT;
        this.globalFAITH = globalFAITH;
        this.globalINTEL = globalINTEL;
    }

    // Getters
    public double getGlobalEXP() {return globalEXP;}
    public double getGlobalLVL() {return globalLVL;}
    public double getGlobalHP() { return globalHP; }
    public double getGlobalMP() { return globalMP; }
    public double getGlobalSTR() { return globalSTR; }
    public double getGlobalDEX() { return globalDEX; }
    public double getGlobalFORT() { return globalFORT; }
    public double getGlobalFAITH() { return globalFAITH; }
    public double getGlobalINTEL() { return globalINTEL; }

    // Setters
    public void setGlobalEXP() {this.globalEXP = globalEXP;}
    public void setGlobalLVL() {this.globalLVL = globalLVL;}
    public void setGlobalHP(double globalHP) { this.globalHP = globalHP; }
    public void setGlobalMP(double globalMP) { this.globalMP = globalMP; }
    public void setGlobalSTR(double globalSTR) { this.globalSTR = globalSTR; }
    public void setGlobalDEX(double globalDEX) { this.globalDEX = globalDEX; }
    public void setGlobalFORT(double globalFORT) { this.globalFORT = globalFORT; }
    public void setGlobalFAITH(double globalFAITH) { this.globalFAITH = globalFAITH; }
    public void setGlobalINTEL(double globalINTEL) { this.globalINTEL = globalINTEL; }

    public void showStatus() {
        System.out.println("HP: " + globalHP + " | STR: " + globalSTR + " | DEX: " + globalDEX +
                           " | FOR: " + globalFORT + " | INT: " + globalINTEL + " | FTH: " + globalFAITH);
    }
}