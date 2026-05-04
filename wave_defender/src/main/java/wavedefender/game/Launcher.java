package wavedefender.game;

public class Launcher {

    public static void main(String[] args){
        new Thread(new GameLoop()).start(); // start() method for executing logic inside a thread
        



    }


    
}
