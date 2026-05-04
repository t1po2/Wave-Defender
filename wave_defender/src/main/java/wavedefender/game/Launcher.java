package wavedefender.game;

public class Launcher {

    public static void main(String[] args){
      GameLoop gameLoop = new GameLoop();               // declare a variable for a new GameLoop instance
      Thread gameThread = new Thread(gameLoop);         //execute the gameLoop in a Thread 
      gameThread.start();                                   // start running the thread  
        

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {         // stop the "gameThread"
               gameLoop.stop();
          }));

    }


    
}
