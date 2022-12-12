import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class Player extends Thread implements KeyListener {
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


    public void keyPressed (KeyEvent e) {
        e = e || window.event;

        if (e.keyCode == '38') {
            this.y -= this.spdY;
        }
        else if (e.keyCode == '40') {
            this.y += this.spdY;
        }
        else if (e.keyCode == '37') {
            this.x -= this.spdX;
        }
        else if (e.keyCode == '39') {
            this.x = this.spdX;
        }
    }

    public void run() {
        keyPressed(null);
    }
}
