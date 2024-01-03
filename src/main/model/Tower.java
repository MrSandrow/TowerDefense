package main.model;

public class Tower {
    private int range;
    private int damage;
    private int cost; // Coût pour placer la tour
    private TowerType type; // Type de la tour, par exemple: sniper, canon, etc.

    public Tower(int range, int damage, int cost, TowerType type) {
        this.range = range;
        this.damage = damage;
        this.cost = cost;
        this.type = type;
    }

    // Méthode pour attaquer les Bloons
    public void attack(Bloons target) {
        if (isInRange(target)) {
            target.takeDamage(damage);
            // Vous pouvez ajouter plus de logique ici, comme des effets spéciaux
        }
    }

    // Vérifie si un Bloon est à portée de la tour
    private boolean isInRange(Bloons target) {
        // Implémentez la logique pour déterminer si le Bloon est à portée
        // Cela dépendra de votre système de coordonnées et de la position des Bloons
        return false; // Exemple, à remplacer par la logique réelle
    }

    // Getters et setters
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public TowerType getType() {
        return type;
    }

    public void setType(TowerType type) {
        this.type = type;
    }
}

// Énumération pour les différents types de tours
enum TowerType {
    SNIPER,
    CANNON,
    LASER,
}
