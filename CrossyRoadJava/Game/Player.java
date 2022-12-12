import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class Player extends Thread {
    JLabel lable;
    int spdX;
    int spdY;
    int x;
    int y;

    Player(JLabel lable, int posX, int posY, int speedX, int speedY) {
        this.lable = lable;
        this.x = posX;
        this.y = posY;
        this.spdX = speedX;
        this.spdY = speedY;

    }

    public void keyTyped(KeyEvent e) {
        // Invoked when a key has been typed.
    }

    public void keyPressed(KeyEvent e) {
        // Invoked when a key has been pressed.
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Premuto");
        }
    }

    public void keyReleased(KeyEvent e) {
        // Invoked when a key has been released.
    }

    public void run() {
        
    }
}
