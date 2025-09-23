package main.java.game;
import java.util.Scanner;
import java.lang.reflect.Array;

public class Menu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String arr[] = new String[2];
        arr[0] = "Start";
        arr[1] = "Options";
        int i = 0;
        String pointer = ">";

        int selectedIndex = 0;

            for (i = 0; i < arr.length; i++) {
                if (i == selectedIndex) {
                System.out.println(pointer + " " + arr[i]);
                } else {
                System.out.println(" " + arr[i]);
            } 
        }

        String input = keyboard.nextLine();
        if (input.equals("w")) {
            selectedIndex++;
            System.out.println(arr[i]);
        } else if (input.equals("s")) {
            selectedIndex--;
            System.out.println(arr[i]);
        }
    }
}

