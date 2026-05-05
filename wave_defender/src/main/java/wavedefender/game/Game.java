package wavedefender.game;


// helpfull vids: https://www.youtube.com/watch?v=Sv5Z-D69fFE


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
        

        // Launcher constructs new instance game 
        // gameloop holds object game and starts render method calls game.render 
        // passes the current object "game" into display.render() bcs the origin gameLoop contains the Object game
        display.render(this);
    }

    

}