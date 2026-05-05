package wavedefender.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {

    private Canvas canvas;


    public Display(int width, int height){
        setTitle("Wave Defender Alpha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setFocusable(false);
        add(canvas);
        pack();

        canvas.createBufferStrategy(3);

        setLocationRelativeTo(null);
        setVisible(true);
        mouseTracker();
    }
   
    public void render(Game game){
      BufferStrategy bufferStrategy = canvas.getBufferStrategy();
      Graphics graphics = bufferStrategy.getDrawGraphics();

      graphics.setColor(Color.GREEN);
      graphics.fillRect(0, 0, canvas.getWidth(),canvas.getHeight());

      graphics.dispose();
      bufferStrategy.show();
    }


    // simple mouse click tracker. using it to pinpoint waypoints for a mappath 

    public void mouseTracker(){
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                System.out.println("waypoints.add(new Point(" + x + "," + y + "));");       // output for easy copy
            }
        });
    }

}

