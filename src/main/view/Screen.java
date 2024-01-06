package main.view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Screen extends JPanel {

    public Screen() {
        // Initialisation supplémentaire si nécessaire
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK); // Définit la couleur de base pour le dessin

        // Exemple : Dessine un rectangle simple pour tester
        g.drawRect(50, 50, 100, 100);

        // Ici, vous ajouterez la logique de dessin de vos tours, bloons, etc.
    }
}
