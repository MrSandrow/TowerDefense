package main.view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game extends JFrame {

    public Game() {
        setTitle("Tower Defense Game");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Screen screen = new Screen(); // Initialise et ajoute le panneau de jeu
        add(screen);
        setVisible(true); // Affiche la fenêtre après l'ajout de tous les composants
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Game::new); // Lance l'interface utilisateur sur le EDT
    }
}
