package wavedefender.game;

public class Launcher {

    public static void main(String[] args){
      Thread gameThread = new Thread(new GameLoop(new Game(800,600)));
      gameThread.start();
       
    }


    
}
