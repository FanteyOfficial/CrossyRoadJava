import java.awt.Image;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Window extends JFrame {
    private JLabel label1;
    public static JButton startButton;
    public static boolean pause = false;
    
    private ImageIcon img1 = new ImageIcon("./img/p1.png");
    Image scaleImg1 = img1.getImage().getScaledInstance(50, 30,Image.SCALE_DEFAULT);
    private JLabel p1;

    private ImageIcon img2 = new ImageIcon("./img/p2.png");
    Image scaleImg2 = img2.getImage().getScaledInstance(50, 30,Image.SCALE_DEFAULT);
    private JLabel p2;

    private ImageIcon img3 = new ImageIcon("./img/p3.jfif");
    Image scaleImg3 = img3.getImage().getScaledInstance(50, 30,Image.SCALE_DEFAULT);
    private JLabel p3;

    private ImageIcon img4 = new ImageIcon("./img/p4.png");
    Image scaleImg4 = img4.getImage().getScaledInstance(50, 30,Image.SCALE_DEFAULT);
    private JLabel p4;
    
    public Window() {
        label1 = new JLabel("Corsa");
        
        startButton = new JButton("Inizia gara");
        startButton.addActionListener(move);

        p1 = new JLabel(new ImageIcon(scaleImg1));
        p2 = new JLabel(new ImageIcon(scaleImg2));
        p3 = new JLabel(new ImageIcon(scaleImg3));
        p4 = new JLabel(new ImageIcon(scaleImg4));

        init();
    }

    public void init() {
        setLayout(null);
        label1.setSize(100, 10);
        label1.setLocation(10, 10);

        startButton.setSize(100, 50);
        startButton.setLocation(50, 10);
        
        p1.setSize(120, 120);
        p1.setLocation(0, 60);
        
        p2.setSize(120, 120);
        p2.setLocation(0, 120);

        p3.setSize(120, 120);
        p3.setLocation(0, 180);

        p4.setSize(120, 120);
        p4.setLocation(0, 240);
        
        add(label1);
        add(startButton);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        setSize(1100, 400);
        show();
    }

    //public void move() {
    ActionListener move = new ActionListener() {
        public void actionPerformed(ActionEvent action) {
            startButton.setEnabled(false);
            int nLaps = 10;
            int nPlayers = 4;
            
            Player p[] = new Player[nPlayers];
            p[0] = new Player(nLaps, p1, 60, 0);
            p[1] = new Player(nLaps, p2, 120, 0);
            p[2] = new Player(nLaps, p3, 180, 0);
            p[3] = new Player(nLaps, p4, 240, 0);

            for (int i=0; i<p.length; i++) {
                p[i].start();
            }
        }   
    };
}

