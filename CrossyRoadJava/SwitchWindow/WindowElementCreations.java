import javax.swing.*;
import java.awt.Color;

public class WindowElementCreations {
    public JButton createButton(String text, boolean withBorder, Color bgColor, Color fgColor) {
        JButton btn = new JButton();
        btn.setBorderPainted(false);
        btn.setBackground(Color.RED);
        btn.setForeground(Color.BLACK);
        btn.setFocusPainted(false);
        //startButton.setContentAreaFilled(false);
        return btn;
    }
}
