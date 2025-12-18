package tetris;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends JFrame{

    // JFrame frame;
    // Panel main_panel;
    static int WIDTH = 500;
    static int HEIGHT = 500;

    Frame() {
        // frame = new JFrame("TETRIS");
        this.setResizable(false);
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setTitle("TETRIS");
    
        // main_panel = new Panel(WIDTH, HEIGHT);
        // main_panel.setVisible(true);



        // this.add(main_panel);
        this.add(new Panel(WIDTH, HEIGHT));

        this.pack();
        this.setVisible(true);
    }
    
}





