import javax.swing.JFrame;
import javax.swing.JLabel;

public class StreetSystem extends Thread {
    JLabel street;
    JLabel[] streets;
    int x = 0, y = 0;

    int maxNumStreet;
    String[][] enemyArr;

    JFrame win;

    StreetSystem(JLabel street, String enemyArr[][], int maxNumStreet, JFrame win) {
        this.street = street;
        this.maxNumStreet = maxNumStreet;
        this.enemyArr = enemyArr;
        this.win = win;
    }

    public void run() {
        createStreets();
    }

    private void createStreets() {
        maxNumStreet = randomBetweenTwoNumbers(0, 8);
        for (int i=0; i<maxNumStreet; i++) {
            streets[i] = street;
            streets[i].setSize(1000, 60);
            streets[i].setLocation(x, y+=60);
        }
    }

    private int randomBetweenTwoNumbers(int max, int min) {
        int r = (int) (Math.random() * (max - min)) + max;
        return r;
    }
}