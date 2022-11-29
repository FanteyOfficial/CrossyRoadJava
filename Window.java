import java.awt.Image;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
    private ImageIcon img1 = new ImageIcon("./img/enemy1.png");
    Image scaleImg1 = img1.getImage().getScaledInstance(75, 40, Image.SCALE_DEFAULT);
    private JLabel p1;

    private ImageIcon img2 = new ImageIcon("./img/enemy2.png");
    Image scaleImg2 = img2.getImage().getScaledInstance(100, 40, Image.SCALE_DEFAULT);
    private JLabel p2;

    private ImageIcon img3 = new ImageIcon("./img/enemy3.png");
    Image scaleImg3 = img3.getImage().getScaledInstance(90, 45, Image.SCALE_DEFAULT);
    private JLabel p3;

    private ImageIcon img4 = new ImageIcon("./img/enemy4.png");
    Image scaleImg4 = img4.getImage().getScaledInstance(90, 50, Image.SCALE_DEFAULT);
    private JLabel p4;

    private ImageIcon img5 = new ImageIcon("./img/enemy5.png");
    Image scaleImg5 = img5.getImage().getScaledInstance(100, 40, Image.SCALE_DEFAULT);
    private JLabel p5;

    private ImageIcon img6 = new ImageIcon("./img/enemy6.png");
    Image scaleImg6 = img6.getImage().getScaledInstance(100, 42, Image.SCALE_DEFAULT);
    private JLabel p6;

    private ImageIcon img7 = new ImageIcon("./img/enemy7.png");
    Image scaleImg7 = img7.getImage().getScaledInstance(90, 45, Image.SCALE_DEFAULT);
    private JLabel p7;

    private ImageIcon img8 = new ImageIcon("./img/enemy8.png");
    Image scaleImg8 = img8.getImage().getScaledInstance(120, 50, Image.SCALE_DEFAULT);
    private JLabel p8;

    public Window() {
        init();
    }

    public void init() {
        setLayout(null);
        setSize(1100, 900);
        p1 = new JLabel(new ImageIcon(scaleImg1));
        p2 = new JLabel(new ImageIcon(scaleImg2));
        p3 = new JLabel(new ImageIcon(scaleImg3));
        p4 = new JLabel(new ImageIcon(scaleImg4));
        p5 = new JLabel(new ImageIcon(scaleImg5));
        p6 = new JLabel(new ImageIcon(scaleImg6));
        p7 = new JLabel(new ImageIcon(scaleImg7));
        p8 = new JLabel(new ImageIcon(scaleImg8));

        p1.setSize(120, 120);
        p1.setLocation(0, 60);

        p2.setSize(120, 120);
        p2.setLocation(0, 120);

        p3.setSize(120, 120);
        p3.setLocation(0, 180);

        p4.setSize(120, 120);
        p4.setLocation(0, 240);

        p5.setSize(120, 120);
        p5.setLocation(0, 300);

        p6.setSize(120, 120);
        p6.setLocation(0, 360);

        p7.setSize(120, 120);
        p7.setLocation(0, 420);

        p8.setSize(120, 120);
        p8.setLocation(0, 480);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        startGame();
        show();
    }

    void startGame() {
        int X = 0;
        Enemy[] enemies = new Enemy[8];
        enemies[0] = new Enemy(p1, X+=60, 0);
        enemies[1] = new Enemy(p2, X+=60, 0);
        enemies[2] = new Enemy(p3, X+=60, 0);
        enemies[3] = new Enemy(p4, X+=60, 0);
        enemies[4] = new Enemy(p5, X+=60, 0);
        enemies[5] = new Enemy(p6, X+=60, 0);
        enemies[6] = new Enemy(p7, X+=60, 0);
        enemies[7] = new Enemy(p8, X+=60, 0);

        for (int i=0; i<enemies.length; i++) {
            enemies[i].start();
        }
    }
}
