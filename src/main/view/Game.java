package main.view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.view.Screen;

public class Game extends JFrame {

    private Screen gameScreen;

    public Game() {
        initUI();
    }

    private void initUI() {
        setTitle("Tower Defense Game");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centre la fenêtre

        gameScreen = new Screen();
        add(gameScreen);

        // Vous pouvez ajouter plus de configuration ici, comme des boutons ou des
        // écouteurs d'événements
    }

    public static void main(String[] args) {
        // Assurez-vous que l'interface utilisateur est mise à jour sur le Event
        // Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            Game ex = new Game();
            ex.setVisible(true);
        });
    }
}
