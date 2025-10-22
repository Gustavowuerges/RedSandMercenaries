package main.java.Entities;

import main.java.Entities.Player;
import main.java.Entities.Job;
import main.java.Entities.Jobs.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCreator {
    private Scanner keyboard = new Scanner(System.in);
    private ArrayList<Job> jobs = new ArrayList<>();

    // Função para limpar a tela do terminal
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void creator() { 
        // Adiciona todas as classes disponíveis
        jobs.add(new Archer());
        jobs.add(new Mage());
        jobs.add(new Paladin());
        jobs.add(new Swordsman());
        jobs.add(new Warrior());

        System.out.println("Tell me, what's your name, roamer of the red sands?");
        String name = keyboard.nextLine();

        int index = 0;
        while (true) {
            clearScreen(); // limpa a tela a cada loop

            System.out.println("Classe atual: " + jobs.get(index).getJOBNAME());
            jobs.get(index).description();
            System.out.println("\nUse 'a' e 'd' para navegar, 'e' para escolher:");

            String input = keyboard.nextLine();

            if (input.equals("a")) {
                index = (index - 1 + jobs.size()) % jobs.size();
            } else if (input.equals("d")) {
                index = (index + 1) % jobs.size();
            } else if (input.equals("e")) {
                break;
            } else {
                System.out.println("Comando inválido! Use 'a', 'd' ou 'e'.");
            }
        }

        Job chosenJob = jobs.get(index);
        Player player = new Player(name, chosenJob);

        clearScreen(); // limpa antes de mostrar o status final
    }
}