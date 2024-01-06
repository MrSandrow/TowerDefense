package main.model;

public class Bloons {
    private int health;
    private int speed;
    private String type; // Type de Bloons, par exemple : "standard", "fortifié", "rapide", etc.
    private int x;
    private int y;

    public Bloons(int health, int speed, String type, int x, int y) {
        this.health = health;
        this.speed = speed;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    // Diminue la santé des Bloons. Appelée lorsque les Bloons sont touchés par une
    // tour.
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            onDestroyed();
        }
    }

    // Méthode appelée lorsque les Bloons sont détruits
    private void onDestroyed() {
        // Ici, vous pouvez ajouter la logique pour ce qui se passe quand les Bloons
        // sont détruits
        // Par exemple, augmenter le score du joueur, générer des sous-Bloons, etc.
        System.out.println("Les Bloons ont été détruits");
    }

    // Méthode pour déplacer les Bloons sur la carte du jeu
    public void move() {
        // Logique pour déplacer les Bloons en fonction de leur vitesse et du chemin
        // défini
    }

    // Getters et setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Méthode toString pour une représentation textuelle des Bloons
    @Override
    public String toString() {
        return "Bloons{" +
                "health=" + health +
                ", speed=" + speed +
                ", type='" + type + '\'' +
                '}';
    }

}
