package main.java;

public class GlobalStatus {
    //Atributos Modificadores Globais
    protected int globalHealth;
    protected int globalStrength;
    protected int globalDexterity;
    protected int globalFortitude;
    protected int globalFaith;
    protected int globalInteligence;

    
    public GlobalStatus(int globalHealth, int globalStrength, int globalDexterity, int globalFortitude, int globalFaith, int globalInteligence) {
    this.globalHealth = globalHealth;
    this.globalStrength = globalStrength;
    this.globalDexterity = globalDexterity;
    this.globalFortitude = globalFortitude;
    this.globalFaith = globalFaith;
    this.globalInteligence = globalInteligence;
    }
}