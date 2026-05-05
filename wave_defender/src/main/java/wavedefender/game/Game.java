package wavedefender.game;


// -- this class Game initializes a Window --
// for now 

public class Game{

    private Display display;



    public Game(int width, int height){

    // -- Creates the Window Application -- 
    display = new Display(width,height);        
    }


    public void update(){

    }

    public void render(){

        display.render(this);


    }

}