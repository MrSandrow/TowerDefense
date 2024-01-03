package main;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Screen extends JPanel {

    public Screen() {
        // Vous pouvez initialiser d'autres composants ou états ici si nécessaire.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Appelle la méthode de la superclasse pour un rendu correct.

        // Définit la couleur de dessin à noir.
        g.setColor(Color.BLACK);

        // Dessine un rectangle (carré dans ce cas) sur le panneau.
        g.drawRect(50, 50, 100, 100);
    }
}
