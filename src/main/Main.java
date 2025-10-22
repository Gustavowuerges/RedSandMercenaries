package main;

import main.java.Entities.CharacterCreator;
import main.java.Features.Map.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        CharacterCreator charCreator = new CharacterCreator();
        charCreator.creator();
        map.grid();
    }
}