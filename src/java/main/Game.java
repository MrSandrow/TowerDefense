package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game extends JFrame {

    public Game() {
        setTitle("Tower Defense Game");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialise et ajoute le panneau de jeu
        Screen screen = new Screen();
        add(screen);

        // Affiche la fenêtre après l'ajout de tous les composants
        setVisible(true);
    }

    public static void main(String[] args) {
        // Assurez-vous que l'interface utilisateur est mise à jour sur le EDT.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Game();
            }
        });
    }
}
