package main.java.Entities.Enemies;

import main.java.Entities.Player;

public class Enemy {

    private States state; // estado atual
    private Player p;
    private int enemyX = 0;
    private int enemyY = 0;

    private int mapWidth;
    private int mapHeight;

    public Enemy(int mapWidth, int mapHeight) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.state = new Patrolling(); // inicia patrulha
    }

    public void setPlayer(Player p) { this.p = p; }
    public void setPosition(int x, int y) { this.enemyX = x; this.enemyY = y; }
    public int getX() { return enemyX; }
    public int getY() { return enemyY; }

    // Atualiza o estado atual
    public void update(char[][] dungeon) {
        state.update(this, dungeon, p);
    }

    // Verifica se está perto do player
    boolean isNear(Player player) {
        int visionRange = 4;
        int dx = player.getPlayerX() - enemyX;
        int dy = player.getPlayerY() - enemyY;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= visionRange;
    }

    void setState(States newState) {
        this.state = newState;
    }

    // Movimento aleatório respeitando paredes
    void moveRandom(char[][] dungeon) {
        int dx = (int) (Math.random() * 3) - 1;
        int dy = (int) (Math.random() * 3) - 1;
        int newX = enemyX + dx;
        int newY = enemyY + dy;

        if (newX >= 0 && newX < dungeon[0].length &&
            newY >= 0 && newY < dungeon.length &&
            dungeon[newY][newX] != '#') {
            enemyX = newX;
            enemyY = newY;
        }
    }

    // Movimento em direção ao player respeitando paredes
    void moveTowards(char[][] dungeon, Player player) {
        int dx = 0, dy = 0;
        if (player.getPlayerX() > enemyX) dx = 1;
        if (player.getPlayerX() < enemyX) dx = -1;
        if (player.getPlayerY() > enemyY) dy = 1;
        if (player.getPlayerY() < enemyY) dy = -1;

        int newX = enemyX + dx;
        int newY = enemyY + dy;

        if (newX >= 0 && newX < dungeon[0].length &&
            newY >= 0 && newY < dungeon.length &&
            dungeon[newY][newX] != '#') {
            enemyX = newX;
            enemyY = newY;
        }
    }

    // Interface dos estados
    interface States {
        void update(Enemy e, char[][] dungeon, Player p);
    }

    // Estado de patrulha
    class Patrolling implements States {
        public void update(Enemy e, char[][] dungeon, Player p) {
            e.moveRandom(dungeon);
            if (e.isNear(p)) {
                e.setState(new Chasing());
            }
        }
    }

    // Estado de perseguição
    class Chasing implements States {
        public void update(Enemy e, char[][] dungeon, Player p) {
            e.moveTowards(dungeon, p);
            if (!e.isNear(p)) {
                e.setState(new Patrolling());
            }
        }
    }
}
