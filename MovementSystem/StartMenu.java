import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class StartMenu extends JFrame {
    private JLabel gameTitle;
    private JButton startButton;
    // private JButton tutorialButton;
    private JButton quitButton;

    public StartMenu() {
        gameTitle = new JLabel("Crossy Road");
        gameTitle.setFont(new Font("sans serif", Font.BOLD, 18));

        startButton = new JButton("Start Game");
        startButton.setBorderPainted(false);
        startButton.setBackground(Color.RED);
        startButton.setForeground(Color.BLACK);
        startButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        startButton.addActionListener(toGame);
        startButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton.setBackground(Color.BLACK);
                startButton.setForeground(Color.RED);
                startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                startButton.setBackground(Color.RED);
                startButton.setForeground(Color.BLACK);
                startButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        /* tutorialButton = new JButton("Info");
        tutorialButton.setBorderPainted(false);
        tutorialButton.setBackground(Color.RED);
        tutorialButton.setForeground(Color.BLACK);
        tutorialButton.setFocusPainted(false);
        tutorialButton.addActionListener(toInfo);
        tutorialButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tutorialButton.setBackground(Color.BLACK);
                tutorialButton.setForeground(Color.RED);
                tutorialButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                tutorialButton.setBackground(Color.RED);
                tutorialButton.setForeground(Color.BLACK);
                tutorialButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }); */

        quitButton = new JButton("QUIT");
        quitButton.setBorderPainted(false);
        quitButton.setBackground(Color.BLUE);
        quitButton.setForeground(Color.WHITE);
        quitButton.setFocusPainted(false);
        quitButton.addActionListener(close);
        /* quitButton.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) { 
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    setVisible(false);
                    dispose();
                }
             }
        
            public void keyReleased(KeyEvent e) {  }
        
            public void keyTyped(KeyEvent e) {  }
        }); */
        quitButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitButton.setBackground(Color.WHITE);
                quitButton.setForeground(Color.BLUE);
                quitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                quitButton.setBackground(Color.BLUE);
                quitButton.setForeground(Color.WHITE);
                quitButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        init();
    }

    public void init() {
        setLayout(null);

        // background window
        getContentPane().setBackground(Color.ORANGE);

        addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) { 
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    setVisible(false);
                    dispose();
                }
             }
        
            public void keyReleased(KeyEvent e) {  }
        
            public void keyTyped(KeyEvent e) {  }
        });

        setSize(300, 300);
        setResizable(false);

        gameTitle.setSize(200, 30);
        gameTitle.setLocation(89, 25);

        startButton.setSize(100, 50);
        startButton.setLocation(95, 75);

        /* tutorialButton.setSize(100, 50);
        tutorialButton.setLocation(95, 110); */

        quitButton.setSize(100, 50);
        quitButton.setLocation(95, 145);

        add(gameTitle);
        add(startButton);
        // add(tutorialButton);
        add(quitButton);

        setVisible(true);
    }

    ActionListener toGame = new ActionListener() {
        public void actionPerformed(ActionEvent action) {
            dispose();
            GameWindow w = new GameWindow();
            w.setVisible(true);
        }
    };

    /* ActionListener toInfo = new ActionListener() {
        public void actionPerformed(ActionEvent action) {
            dispose();
            GameWindow w = new GameWindow();
            w.setVisible(true);
        }
    }; */

    ActionListener close = new ActionListener() {
        public void actionPerformed(ActionEvent action) {
            setVisible(false);
            dispose();
        }
    };
}
