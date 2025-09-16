package main.java.Map;

public class MapRender {

    public static void printMinimap(MapGrid map, int pL, int pC){
        StringBuilder sb = new StringBuilder();
        //percore o mapa linha por linha (L) e coluna por coluna (C)
        for (int l = 0; l < map.height; l++){
            for (int c = 0; c < map.width; c++){
                if (c == pC && l == pL){
                    sb.append("P");// P = jogador
                } else if(!map.visited[l][c]){
                    sb.append("."); //não foi visitado
                } else{
                    sb.append(map.tiles[l][c]); // terreno normal
                }
            }
            sb.append("\n"); // proxima linha
        }

        System.out.println(sb.toString());
    }
    
}