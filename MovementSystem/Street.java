import java.util.Random;

import javax.swing.*;

class Street extends Thread {
    JLabel[] enemies;
    Random r = new Random();
    int speed = r.nextInt(20);
    JLabel street;
    int posX, posY;

    Street(JLabel street, JLabel[] enemies, int posY, int posX) {
        this.enemies = enemies;
        this.street = street;
        this.posX = posX;
        this.posY = posY;
    }

    public void run() {

    }
}
