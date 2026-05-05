package wavedefender.game;

import javax.swing.SwingUtilities;

// -- Launcher.java starts executing GameLoop -- 


public class Launcher {

    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop(new Game(800,600));        // declaring a variable for GameLoop Class
        Thread gameThread = new Thread(gameLoop);                   // initializing a Thread in which the gameLoop logic will be executed 
        gameThread.start();             // start Thread
        
    }
}
