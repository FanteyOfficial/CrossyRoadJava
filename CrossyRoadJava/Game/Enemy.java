import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Enemy extends Thread{
    JLabel label;
    int posY;
    int posX;
    int speed;

    Enemy(JLabel label, int posY, int posX, int speed) {
        this.label = label;
        this.posY = posY;
        this.posX = posX;
        this.speed = speed;
    }

    public void run() {
        while (true) {
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
                label.setLocation(i, posY);
            }
        }
    }
}
