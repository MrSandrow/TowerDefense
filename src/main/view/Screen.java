package main.view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Screen extends JPanel {

    public Screen() {
        // Initialisation des composants ou états spécifiques à la vue
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Appelle la méthode parent pour un rendu correct
        g.setColor(Color.BLACK); // Définit la couleur de dessin à noir
        g.drawRect(50, 50, 100, 100); // Dessine un rectangle
    }
}
