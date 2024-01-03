package main.model;

public class Bloons {
    private int health;
    private int speed;
    private String type; // Type de Bloons, par exemple : "standard", "fortifié", "rapide", etc.

    public Bloons(int health, int speed, String type) {
        this.health = health;
        this.speed = speed;
        this.type = type;
    }
}
