import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.swing.JLabel;

public class Enemy extends Thread {
    JLabel enemyLabel;
    int posY;
    int posX;
    int speed;
    boolean fromLeft;
    JLabel player;

    Enemy(JLabel enemyLabel, int posY, int posX, int speed, boolean fromLeft, JLabel player) {
        this.enemyLabel = enemyLabel;
        this.posY = posY;
        this.posX = posX;
        this.speed = speed;
        this.fromLeft = fromLeft;
        this.player = player;
    }

    public void run() {
        while (true) {
            if (fromLeft) {
                for (int i = 0; i < 1000; i++) {
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
                    enemyLabel.setLocation(i, posY);
                }
            }
            else {
                for (int i = 1000; i > 0; i--) {
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
                    enemyLabel.setLocation(i, posY);
                }
            }
        }
    }
}
