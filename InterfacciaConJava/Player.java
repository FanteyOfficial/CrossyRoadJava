import java.util.*;
import java.lang.Math;
import java.util.Random;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Player extends Thread {
  private int nGiri;
  JLabel label;
  int posY;
  int posX;

  Player(int giri, JLabel label, int posY, int posX) {
    nGiri = giri;
    this.label = label;
    this.posY = posY;
    this.posX = posX;
  }

  public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_ENTER){
        Window.pause = !Window.pause;
        System.out.println("fokjhahgoiuagfa");
      }
  }

  public void run() {
    Random r = new Random();
    for (int j=0; j<nGiri; j++) {
      for (int i = 0; i < 1000; i++) {
          //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
          while (Window.pause) {
            try {
              sleep(1);
              //if (KeyEvent.VK_ENTER == 10) Window.pause = !Window.pause;
            }
            catch (Exception error) {
              
            }
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
    Window.startButton.setEnabled(true);
  }
}

class Space implements KeyListener {
  private static final KeyEvent KeyEvent = null;

  public void keyTyped(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {  
      Window.pause = !Window.pause;
    }
  }

  public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_SPACE) {  
        Window.pause = !Window.pause;
      }
  }

  public void keyReleased(KeyEvent e) {

  }
}