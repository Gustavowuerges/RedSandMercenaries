 package main.java.Map;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class AsciiMap {

    public static void ShowMap(String Maptxt, int maxCols) {
        String path = "Map.txt";
        try (InputStream In = AsciiMap.class.getResourceAsStream(path)){
            if (In == null){
                System.out.println("[Erro] Arquivo" + "/Map.txt" + " Não encontrado no Local!");
                return;
            }
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))){
                String line;
                while ((line = reader.readLine()) != null) {
                    for (int i = 0; i < line.length(); i += maxCols) {
                        int end = Math.min(i + maxCols, line.length());
                        System.out.println(line.substring(i, end));
                }
            }
        } catch (Exception e) {
           System.out.println("[Erro] Falha ao Ler " + "/Map.txt" + ": " + e.getMessage());
        }
    }
}
}