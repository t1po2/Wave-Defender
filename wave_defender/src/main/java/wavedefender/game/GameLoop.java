package wavedefender.game;

public class GameLoop implements Runnable{


    private boolean running; // am i running?
    private final double updateRate = 1.0d/60.d; // Rate: 60 updates per sec 

    private long nextStatTime;
    private int fps, ups;   // frames per sec ; updates per sec

    // finally a helpful video https://www.youtube.com/watch?v=LICU6zH8gVU
    // watch the video again make comments
    @Override
    public void run(){

        running  = true;        
        double  accumulator = 0;      //keeps track of time to update
        long currentTime;
        long lastUpdate = System.currentTimeMillis();



        //actual gameloop : 
        while(running){
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSec = (currentTime - lastUpdate) /1000d; // calculates Gap bewtween initiated time and time until next Update
            accumulator = lastRenderTimeInSec;   // displays lastRenderTimeInSec
            lastUpdate = currentTime;   //prep for next loop 

            while (accumulator > updateRate){
                update();
                
                accumulator -= updateRate; 
            }
            render();
            printStats();
        }
    }




    private void printStats(){
        if ( System.currentTimeMillis() > nextStatTime) {
            System.out.println(String.format("FPS: %d, UPS:  %d", fps,ups));
        }
    }


    private void render() {
        fps++;

    }

    private void update() {
        ups++;

    }

}
