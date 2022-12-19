import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enemy extends Thread {
    JLabel enemyLabel;
    int speed;
    boolean fromLeft;
    JFrame schermo;
    JLabel player;

    Enemy(JLabel enemyLabel, int speed, boolean fromLeft, JFrame schermo, JLabel player) {
        this.player = player;
        this.schermo = schermo;
        this.enemyLabel = enemyLabel;
        this.speed = speed;
        this.fromLeft = fromLeft;
    }

    public void run() {
        System.out.println("++++++++++++++++++++run++++++++++++++++++++++++++++++++++");
        while (true) {
            if (fromLeft) {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(player.getLocation());
                    if(this.enemyLabel.getLocation().y >= Player.posY && this.enemyLabel.getLocation().y + 50 <= Player.posY && this.enemyLabel.getLocation().y >= Player.posX && this.enemyLabel.getLocation().x + enemyLabel.getWidth() >= Player.posX){
                        Player.resetPosition();
                        Player.resetPoints();
                        schermo.dispose();
                        StartMenu w = new StartMenu();
                        w.setVisible(true);
                    }
                    //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
                    try {
                        sleep(1);
                        //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
                    }
                    catch (Exception error) {
                        
                    }
                    try {
                        sleep(speed);
                    }
                    catch (Exception e) {
                        System.out.println("error");
                    }
                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
                    System.out.println(true + " posizione " + i);
                }
            }
            else {
                for (int i = 1000; i > 0; i--) {
                    System.out.println(player.getLocation());
                    if(this.enemyLabel.getLocation().y >= Player.posY && this.enemyLabel.getLocation().y + 50 <= Player.posY && this.enemyLabel.getLocation().y >= Player.posX && this.enemyLabel.getLocation().x + enemyLabel.getWidth() >= Player.posX){
                        Player.resetPosition();
                        Player.resetPoints();
                        schermo.dispose();
                        StartMenu w = new StartMenu();
                        w.setVisible(true);
                    }
                    //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
                    try {
                        sleep(1);
                        //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
                    }
                    catch (Exception error) {
                        
                    }
                    try {
                        sleep(speed);
                    }
                    catch (Exception e) {
                        System.out.println("error");
                    }
                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
                    System.out.println(false + " posizione " + i);
                }
            }
        }
    }
}
