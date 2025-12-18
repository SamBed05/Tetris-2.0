package tetris;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Frame extends JFrame{

    JFrame frame;
    JPanel panel;
    GridBagConstraints gbc;

    Frame() {
        frame = new JFrame("TETRIS");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
