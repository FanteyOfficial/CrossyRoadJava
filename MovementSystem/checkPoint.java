import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkPoint extends Thread {
    JLabel checkPoint;
    JLabel player;

    checkPoint(JLabel checkPoint, JLabel player, Player val) {
        this.checkPoint = checkPoint;
        this.player = player;
    }

    public void run() {
        if (player.getLocation() == checkPoint.getLocation()) {
            Player.resetPosition();
            player.setLocation(Player.startPosX, Player.startPosY);
        }
    }
}
