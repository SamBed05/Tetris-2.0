package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
// import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{

    JPanel panel;
    // GridBagConstraints gbc;

    boolean running;
    Timer timer;
    static int INTERVAL = 1000;

    Panel(int WIDTH, int HEIGHT) {
        
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        // this.setLayout(new GridBagLayout());

        start();
        
    }

    public void start() {
        running = true;
        timer = new Timer(INTERVAL, this);
        timer.start();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.orange);
        g.drawRect(0,0, 100,100);
        System.out.println("fas");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (running) {

        }
        repaint();


    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override 
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
        }
    } 

    
}
