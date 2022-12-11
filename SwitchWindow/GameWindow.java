import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;

public class GameWindow extends JFrame {
    private JButton backButton;

    public GameWindow() {
        backButton = new JButton("Main Menu");
        backButton.setBorderPainted(false);
        backButton.setBackground(Color.ORANGE);
        backButton.setForeground(Color.BLACK);
        backButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        backButton.addActionListener(toMenu);
        backButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButton.setBackground(Color.BLACK);
                backButton.setForeground(Color.ORANGE);
                backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                backButton.setBackground(Color.ORANGE);
                backButton.setForeground(Color.BLACK);
                backButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        init();
    }

    public void init() {
        setLayout(null);
        setSize(1100, 900);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);

        backButton.setSize(100, 50);
        backButton.setLocation(5, 5);
        
        add(backButton);
        
        setVisible(true);
    }

    ActionListener toMenu = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            dispose();
            Window w = new Window();
            w.setVisible(true);
        }
    };
}
