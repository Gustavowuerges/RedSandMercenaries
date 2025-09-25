package main.java;

public class GlobalStatus {
    //Atributos Modificadores Globais
    protected String globalName;
    protected int globalHealth;
    protected int globalStrength;
    protected int globalDexterity;
    protected int globalFortitude;
    protected int globalFaith;
    protected int globalInteligence;

    
    public GlobalStatus(String globalName, int globalHealth, int globalStrength, int globalDexterity, int globalFortitude, int globalFaith, int globalInteligence) {
    this.globalName = globalName;
    this.globalHealth = globalHealth;
    this.globalStrength = globalStrength;
    this.globalDexterity = globalDexterity;
    this.globalFortitude = globalFortitude;
    this.globalFaith = globalFaith;
    this.globalInteligence = globalInteligence;
    }

    public void showStatus() {
        System.out.println("Name: " + globalName + " | HP: " + globalHealth + " | STR: " + globalStrength + " | DEX: " + globalDexterity +
                           " | FOR: " + globalFortitude + " | INT: " + globalInteligence + " | FTH: " + globalFaith);
    }

    public void showClassStatus() {
        System.out.println("HP: " + globalHealth + " | STR: " + globalStrength + " | DEX: " + globalDexterity +
                           " | FOR: " + globalFortitude + " | INT: " + globalInteligence + " | FTH: " + globalFaith);
    }
}

