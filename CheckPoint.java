import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckPoint extends Thread {
    JLabel checkPoint;
    JLabel player;
    JLabel points;
    JFrame win;

    CheckPoint(JLabel checkPoint, JLabel player, JLabel points, JFrame win) {
        this.checkPoint = checkPoint;
        this.player = player;
        this.points = points;
        this.win = win;
    }

    public void run() {
        /* System.out.println(checkPoint.getLocation()); */
        while (true) { 
            System.out.println(player.getLocation()); // senza questo non va per qualche motivo :)
            
            if (Player.posY == checkPoint.getLocation().y && Player.posX <= 570 && Player.posX >= 370) {
                
                Player.resetPosition();
                Player.points++;
                points.setText("Points: " + Player.points);
                player.setLocation(Player.startPosX, Player.startPosY);

                GameWindow.streetFunctions.spawnEnemys();
            }
        }
    }
}
