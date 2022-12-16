import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class Player /* extends Thread */ /* implements KeyListener */ {
    /* JLabel lable;
    int spdX;
    int spdY;
    int x;
    int y; */
    //GameWindow win;

    public static int posX = 450;
    public static int posY = 680;
    public static int startPosX = 450;
    public static int startPosY = 680;

    public static void resetPosition() {
        posX = startPosX;
        posY = startPosY;
    }

    //Player(int startPosX, int startPosY/* JLabel lable, int posX, int posY, int speedX, int speedY *//* , GameWindow window */) {
        /* this.lable = lable;
        this.x = posX;
        this.y = posY;
        this.spdX = speedX;
        this.spdY = speedY; */
        /* this.win = window;
        window.addKeyListener(this); */
    //}

    /* @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            x += 10;
            lable.setLocation(x, y);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    } */

    //public void run() {
        /* new Player(lable, x, y, x, y, win); */
    //}
}
