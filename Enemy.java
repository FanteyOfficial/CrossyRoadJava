import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enemy extends Thread {
    JLabel enemyLabel;
    int speed;
    boolean fromLeft;
    JFrame schermo;
    JLabel player;

    Enemy(JLabel enemyLabel, int speed, boolean fromLeft, JFrame schermo, JLabel player) {
        this.player = player;
        this.schermo = schermo;
        this.enemyLabel = enemyLabel;
        this.speed = speed;
        this.fromLeft = fromLeft;
    }

    public void run() {
        System.out.println("++++++++++++++++++++run++++++++++++++++++++++++++++++++++");
        while (true) {
            if (fromLeft) {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(player.getLocation());
                    if( player.getLocation().y >= this.enemyLabel.getLocation().y && player.getLocation().y <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x >= this.enemyLabel.getLocation().x && player.getLocation().x <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y + 49 >= this.enemyLabel.getLocation().y && player.getLocation().y + 49 <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x >= this.enemyLabel.getLocation().x && player.getLocation().x <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y + 49 >= this.enemyLabel.getLocation().y && player.getLocation().y + 49<= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x + 49 >= this.enemyLabel.getLocation().x && player.getLocation().x + 49 <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y >= this.enemyLabel.getLocation().y && player.getLocation().y <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x + 49 >= this.enemyLabel.getLocation().x && player.getLocation().x + 49 <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()){
                        Player.resetPosition();
                        Player.resetPoints();
                        schermo.dispose();
                        StartMenu w = new StartMenu();
                        w.setVisible(true);
                        GameWindow.streetFunctions.stopEnemy();
                    }
                        
                    try {
                        sleep(speed);
                    }
                    catch (Exception e) {
                        System.out.println("error");
                    }

                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
                    System.out.println(true + " posizione " + i);
                }
            }
            else {
                for (int i = 1000; i > 0; i--) {
                    System.out.println(player.getLocation());
                    if( player.getLocation().y >= this.enemyLabel.getLocation().y && player.getLocation().y <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x >= this.enemyLabel.getLocation().x && player.getLocation().x <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y + 49 >= this.enemyLabel.getLocation().y && player.getLocation().y + 49 <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x >= this.enemyLabel.getLocation().x && player.getLocation().x <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y + 49 >= this.enemyLabel.getLocation().y && player.getLocation().y + 49<= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x + 49 >= this.enemyLabel.getLocation().x && player.getLocation().x + 49 <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()
                        ||
                        player.getLocation().y >= this.enemyLabel.getLocation().y && player.getLocation().y <= this.enemyLabel.getLocation().y + 60 &&
                        player.getLocation().x + 49 >= this.enemyLabel.getLocation().x && player.getLocation().x + 49 <= this.enemyLabel.getLocation().x + this.enemyLabel.getWidth()){
                        Player.resetPosition();
                        Player.resetPoints();
                        schermo.dispose();
                        StartMenu w = new StartMenu();
                        w.setVisible(true);
                        GameWindow.streetFunctions.stopEnemy();
                    }

                    try {
                        sleep(speed);
                    }
                    catch (Exception e) {
                        System.out.println("error");
                    }
                    
                    enemyLabel.setLocation(i, enemyLabel.getLocation().y);
                    System.out.println(false + " posizione " + i);
                }
            }
        }
    }
}
