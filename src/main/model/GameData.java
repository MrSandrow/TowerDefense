package main.model;

public class GameData {
    private int score;
    private int level;
    private int lives; // Vies restantes du joueur
    private int resources; // Ressources disponibles pour construire des tours

    public GameData() {
        this.score = 0;
        this.level = 1;
        this.lives = 3; // Par exemple, le joueur commence avec 3 vies
        this.resources = 100; // Par exemple, le joueur commence avec 100 ressources
    }

    // Méthodes pour gérer le score
    public void addScore(int points) {
        this.score += points;
    }

    public void subtractScore(int points) {
        this.score = Math.max(0, this.score - points);
    }

    // Méthodes pour gérer les vies
    public void loseLife() {
        this.lives = Math.max(0, this.lives - 1);
    }

    // Méthodes pour gérer les ressources
    public void addResources(int amount) {
        this.resources += amount;
    }

    public void spendResources(int amount) {
        this.resources = Math.max(0, this.resources - amount);
    }

    // Getters et setters
    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLives() {
        return lives;
    }

    public int getResources() {
        return resources;
    }
}
