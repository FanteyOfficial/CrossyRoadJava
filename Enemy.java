import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.swing.JLabel;

public class Enemy extends Thread {
    JLabel enemyLabel;
    int speed;
    boolean fromLeft;

    Enemy(JLabel enemyLabel, int speed, boolean fromLeft) {
        this.enemyLabel = enemyLabel;
        this.speed = speed;
        this.fromLeft = fromLeft;
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
                        sleep(1000);
                    }
                    catch (Exception e) {
                        System.out.println("error");
                    }
                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
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
                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
                }
            }
        }
    }
}
