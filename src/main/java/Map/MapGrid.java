package main.java.Map;

public class MapGrid {

    //inicia as variaveis em final para não ser alteradas
    public final int width, height; //tamanho e altura do mapa
    public final char[][] tiles; //cada local do mapa como exemplo: deserto, cidade, etc...
    public final boolean[][] visited; // marca se o jogador já visitou aquele local

    //faz um objeto para armazenar cada local e também preencher-los 
    public MapGrid(int w , int h, char defaultTitle){
        this.width = w; this.height = h;
        this.tiles = new char[h][w];
        this.visited = new boolean[h][w];
        for (int i = 0; i < h; i++){
            for (int k = 0; k < w; k++){
                tiles[i][k] = defaultTitle;// preenche tudo com o terreno inicial
            }
        }
    }
}