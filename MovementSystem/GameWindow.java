import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;

public class GameWindow extends JFrame {
    private JButton backButton;

    private JButton upButton, rightButton, leftButton, downButton;

    private JLabel checkPointLabel;
    private JLabel startPointLabel;
    private JLabel playerPointsLabel;

    private JLabel playerLabel = new JLabel(new ImageIcon("./img/chicken.png"));

    private String[][] enemyInformationArr; // [[EnemyImage, enemySizeWidth, enemySizeHeight, speed, formLeft], [...], [...]]

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

        upButton = new JButton("UP");
        leftButton = new JButton("LEFT");
        rightButton = new JButton("RIGHT");
        downButton = new JButton("DOWN");

        upButton.setBorderPainted(false);
        upButton.setBackground(Color.ORANGE);
        upButton.setForeground(Color.BLACK);
        upButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        /* upButton.addActionListener(toUp); */
        upButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upButton.setBackground(Color.BLACK);
                upButton.setForeground(Color.ORANGE);
                upButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                upButton.setBackground(Color.ORANGE);
                upButton.setForeground(Color.BLACK);
                upButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (!(Player.posY - 20 < 0))
                    Player.posY -= 20;
                playerLabel.setLocation(Player.posX, Player.posY);
            }
        });

        downButton.setBorderPainted(false);
        downButton.setBackground(Color.ORANGE);
        downButton.setForeground(Color.BLACK);
        downButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        /* downButton.addActionListener(toUp); */
        downButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downButton.setBackground(Color.BLACK);
                downButton.setForeground(Color.ORANGE);
                downButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                downButton.setBackground(Color.ORANGE);
                downButton.setForeground(Color.BLACK);
                downButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (Player.posY + 20 < getBounds().getSize().height - 150)
                    Player.posY += 20;
                playerLabel.setLocation(Player.posX, Player.posY);
            }
        });

        leftButton.setBorderPainted(false);
        leftButton.setBackground(Color.ORANGE);
        leftButton.setForeground(Color.BLACK);
        leftButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        /* leftButton.addActionListener(toUp); */
        leftButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftButton.setBackground(Color.BLACK);
                leftButton.setForeground(Color.ORANGE);
                leftButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                leftButton.setBackground(Color.ORANGE);
                leftButton.setForeground(Color.BLACK);
                leftButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (!(Player.posX - 20 < 0))
                    Player.posX -= 20;
                playerLabel.setLocation(Player.posX, Player.posY);
            }
        });

        rightButton.setBorderPainted(false);
        rightButton.setBackground(Color.ORANGE);
        rightButton.setForeground(Color.BLACK);
        rightButton.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        /* rightButton.addActionListener(toUp); */
        rightButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rightButton.setBackground(Color.BLACK);
                rightButton.setForeground(Color.ORANGE);
                rightButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                //startButton.setBackground(UIManager.getColor("control"));
                rightButton.setBackground(Color.ORANGE);
                rightButton.setForeground(Color.BLACK);
                rightButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (Player.posX + 20 < getBounds().getSize().width - 100)
                    Player.posX += 20;
                playerLabel.setLocation(Player.posX, Player.posY);
            }
        });

        checkPointLabel = new JLabel();
        checkPointLabel.setBackground(Color.GREEN);
        checkPointLabel.setOpaque(true);

        startPointLabel = new JLabel();
        startPointLabel.setBackground(Color.ORANGE);
        startPointLabel.setOpaque(true);
        
        playerPointsLabel = new JLabel("Points: " + Player.points);

        // new Player(playerLabel, 250, 250, 10, 10, this);
        
        //playerLabel.addKeyListener();

        init();
    }

    public void init() {
        setLayout(null);
        setSize(1100, 900);
        setLocationRelativeTo(null);
        setTitle("CROSSY ROAD");
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);

        CheckPoint c = new CheckPoint(checkPointLabel, playerLabel, playerPointsLabel);
        c.start();

        backButton.setSize(100, 50);
        backButton.setLocation(5, 5);

        playerLabel.setSize(100, 100);
        playerLabel.setLocation(Player.startPosX, Player.startPosY);

        upButton.setSize(100, 50);
        upButton.setLocation(880, 0);
        downButton.setSize(100, 50);
        downButton.setLocation(880, 100);
        leftButton.setSize(100, 50);
        leftButton.setLocation(780, 50);
        rightButton.setSize(100, 50);
        rightButton.setLocation(980, 50);

        checkPointLabel.setSize(300, 100);
        checkPointLabel.setLocation(getBounds().getSize().width / 3, 0);

        startPointLabel.setSize(300, 100);
        startPointLabel.setLocation(getBounds().getSize().width / 3, getBounds().getSize().height - 200);
        
        playerPointsLabel.setSize(100, 50);
        playerPointsLabel.setLocation(150, 0);

        add(backButton);
        add(playerLabel);
        add(upButton);
        add(downButton);
        add(leftButton);
        add(rightButton);
        add(checkPointLabel);
        add(startPointLabel);
        add(playerPointsLabel);
        
        setVisible(true);
    }

    ActionListener toMenu = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            dispose();
            StartMenu w = new StartMenu();
            w.setVisible(true);
        }
    };

    /* ActionListener toUp = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            playerY += 10;
            playerLabel.setLocation(playerX, playerY);
        }
    }; */

    /* class CustomKeyListener implements KeyListener{
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
           if(e.getKeyCode() == KeyEvent.VK_ENTER){
              playerLabel.setLocation(10, 10);
           }
        }
        public void keyReleased(KeyEvent e) {
        }   
     } */
}
