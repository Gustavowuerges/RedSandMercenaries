package main.java.game;

public class GameStart {
    public void start() {
        Menu menu = new Menu();
        menu.StartMenu(); // exibe menu principal
        System.out.println("Welcome to the red dunes wanderer...tell me, who are you?");
        
        JobSelection jobSelection = new JobSelection();
        jobSelection.startSelection(); // player escolhe classe
        
    }
}