package main.view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game extends JFrame {

    public Game() {
        setTitle("Tower Defense Game");
        setSize(800, 600); // Définit la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centre la fenêtre

        Screen screen = new Screen();
        add(screen); // Ajoute le Screen au JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Game()); // Lance la fenêtre dans le EDT
    }
}
