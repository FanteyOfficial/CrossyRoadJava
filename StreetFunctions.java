import java.math.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StreetFunctions{
    JFrame winWin;
    JLabel[] street = new JLabel[8];
    int[] streetSpeed = new int[8];
    int difficolta = 10;

    Enemy[] enemy = new Enemy[1000];

    String[][] enemyInformationArr = {{"./img/enemy1.png", "75", "40", "true"},
                                      {"./img/enemy2.png", "100", "40", "false"},
                                      {"./img/enemy3.png", "75", "40", "true"},
                                      {"./img/enemy4.png", "100", "40", "false"},
                                      {"./img/enemy5.png", "75", "40", "true"},
                                      {"./img/enemy6.png", "100", "40", "false"},
                                      {"./img/enemy7.png", "75", "40", "true"},
                                      {"./img/enemy8.png", "100", "40", "false"}};


    StreetFunctions (JFrame winFrame){
        this.winWin = winFrame;
    }

    private int placeStreet(int i){
        winWin.add(street[i]);
        return 0;
    }

    private int createStreet(int i, int y){
        street[i] = new JLabel(new ImageIcon("./img/street.png"));
        street[i].setSize(2000, 60);
        street[i].setLocation(0, y);

        streetSpeed[i] = randomNumber()*1000;

        return 0;
    }

    public int start(){
        int y = 120;
        for (int i = 0; i < 8; i++){
            createStreet(i, y);
            placeStreet(i);

            y += 72;
        }
        return 0;
    }

    public int spawnEnemys(){
        for(int i = 0; i < 8; i++){
            if(randomNumber() <= difficolta)
                winWin.add(spawnEnemy(i).enemyLabel);
        }

        return 0;
    }

    private Enemy spawnEnemy(int i){
        Enemy a = new Enemy(newEnemyLable(i), streetSpeed[i], Boolean.parseBoolean(enemyInformationArr[i][3]));
        return a;
    }

    private int randomNumber(){
        int x = (int) (Math.random()*10);
        return x;
    }

    private JLabel newEnemyLable(int i){
        JLabel x = new JLabel(enemyInformationArr[i][0]);
        x.setSize(Integer.parseInt(enemyInformationArr[i][1]), Integer.parseInt(enemyInformationArr[i][2]));
        if(enemyInformationArr[i][3].equalsIgnoreCase("true")){
            x.setLocation(0, street[i].getLocation().y);
        }else{
            x.setLocation(winWin.getBounds().width, street[i].getLocation().y);
        }
        return x;
    }

}
