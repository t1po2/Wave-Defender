package wavedefender.game;

public class GameLoop implements Runnable{


    private boolean running; // am i running?
    private final double updateRate = 1.0d/60.d; // Rate: 60 updates per sec 


    // finally a helpful video https://www.youtube.com/watch?v=LICU6zH8gVU
    // watch the video again make comments
    @Override
    public void run(){

        running  = true;        
        double  accumulator = 0;      //keeps track of time to update
        long currentTime, lastUpdate = System.currentTimeMillis();



        //actual gameloop : 
        while(running){
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSec = (currentTime - lastUpdate) /1000d;
            accumulator = lastRenderTimeInSec;
            lastUpdate = currentTime;

            while (accumulator > updateRate){
                update();
                
                accumulator -= updateRate; 
            }
            render();
        }
    }


    private void render() {

    }

    private void update() {

    }

}
