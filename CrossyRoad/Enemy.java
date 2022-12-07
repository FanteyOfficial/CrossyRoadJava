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

    Enemy(JLabel label, int posY, int posX) {
        this.label = label;
        this.posY = posY;
        this.posX = posX;
    }

    public void run() {
        Random r = new Random();
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
                    sleep(r.nextInt(10));
                }
                catch (Exception e) {
                    System.out.println("error");
                }
                label.setLocation(i, posY);
            }
        }
    }
}
