package wavedefender.game;

import javax.swing.SwingUtilities;

public class Launcher {

    public static void main(String[] args) {
        // This tells Java to run the GUI code on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            System.out.println("Creating Window...");
            Display display = new Display(800, 600);            
            System.out.println("Window created and visible");
        });
    }
}