import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Enemy extends Thread{
    private int nGiri;
    JLabel label;
    int posY;
    int posX;

    Enemy(int giri, JLabel label, int posY, int posX) {
    nGiri = giri;
    this.label = label;
    this.posY = posY;
    this.posX = posX;
    }

    public void run() {
        Random r = new Random();
        for (int j=0; j<nGiri; j++) {
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
