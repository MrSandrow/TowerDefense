package main.view;

import main.model.Bloons;
import main.model.Tower;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.List;
import java.util.ArrayList;

public class Screen extends JPanel {

    private List<Bloons> bloonsList;
    private List<Tower> towerList;
    private Image bloonImage;
    private Image towerImage;

    public Screen() {
        bloonsList = new ArrayList<>();
        towerList = new ArrayList<>();

        // Charger les images pour les Bloons et les tours depuis le dossier ressources
        bloonImage = new ImageIcon(getClass().getResource("/main/ressources/bloonImage.png")).getImage();
        towerImage = new ImageIcon(getClass().getResource("/main/ressources/towerImage.png")).getImage();

        // Exemple d'ajout de Bloons et de tours pour le test
        bloonsList.add(new Bloons(10, 5, "standard", 100, 100));
        towerList.add(new Tower(100, 10, 50, TowerType.CANNON, 50, 50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessiner les Bloons
        for (Bloons b : bloonsList) {
            g.drawImage(bloonImage, b.getX(), b.getY(), this);
        }

        // Dessiner les tours
        for (Tower t : towerList) {
            g.drawImage(towerImage, t.getX(), t.getY(), this);
        }
    }

    // Méthodes pour ajouter des Bloons et des tours à la liste
    public void addBloon(Bloons b) {
        bloonsList.add(b);
    }

    public void addTower(Tower t) {
        towerList.add(t);
    }

    // Méthode pour la mise à jour de l'état du jeu
    public void updateGameState() {
        // Ajouter la logique pour mettre à jour le jeu à chaque frame
        // Par exemple, déplacer les Bloons, vérifier les collisions, etc.
        for (Bloons b : bloonsList) {
            b.move(); // Mettre à jour la position des Bloons
        }

        repaint(); // Rafraîchir l'affichage après chaque mise à jour
    }
}
