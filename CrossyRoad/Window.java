import java.awt.Image;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
    private ImageIcon img1 = new ImageIcon("./img/p1.png");
    Image scaleImg1 = img1.getImage().getScaledInstance(50, 30,Image.SCALE_DEFAULT);
    private JLabel p1;

    public Window() {
        init();
    }

    public void init() {
        setLayout(null);
        p1 = new JLabel(new ImageIcon(scaleImg1));
        setSize(1100, 400);

        p1.setSize(120, 120);
        p1.setLocation(0, 60);

        add(p1);
        show();
    }
}
