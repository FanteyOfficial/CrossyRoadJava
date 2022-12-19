import java.math.*;
import java.lang.Thread;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StreetFunctions{
    JFrame winWin;
    JLabel[] street = new JLabel[8];
    int[] streetSpeed = new int[8];
    int difficolta = 10;
    JLabel player;

    Enemy[] enemy = new Enemy[1000];
    JLabel[] enemyLabel = new JLabel[1000];
    int nEnemy;

    String[][] enemyInformationArr = {{"./img/enemy1.png", "75", "50", "true"},
                                      {"./img/enemy2.png", "100", "50", "false"},
                                      {"./img/enemy3.png", "75", "50", "true"},
                                      {"./img/enemy4.png", "100", "50", "false"},
                                      {"./img/enemy5.png", "75", "50", "true"},
                                      {"./img/enemy6.png", "100", "50", "false"},
                                      {"./img/enemy7.png", "75", "50", "true"},
                                      {"./img/enemy8.png", "100", "50", "false"}};


    StreetFunctions (JFrame winFrame, JLabel player){
        this.player = player;
        this.winWin = winFrame;
    }

    private int placeStreet(int i){
        System.out.println("++++++++++++++++++++METTISTRADE++++++++++++++++++++++++++++++++++");
        winWin.add(street[i]);
        return 0;
    }

    private int createStreet(int i, int y){
        System.out.println("++++++++++++++++++++STRADE++++++++++++++++++++++++++++++++++");
        street[i] = new JLabel(new ImageIcon("./img/street.png"));
        street[i].setSize(2000, 60);
        street[i].setLocation(0, y);

        streetSpeed[i] = randomNumber();

        return 0;
    }

    public int inizio(){
        System.out.println("++++++++++++++++++++INIZIO++++++++++++++++++++++++++++++++++");
        int y = 120;
        for (int i = 0; i < 8; i++){
            createStreet(i, y);
            //placeStreet(i);

            y += 72;
        }

        //Place holder: ferma i thread enemy
        nEnemy = 0;
        return 0;
    }

    public int spawnEnemys(){
        System.out.println("++++++++++++++++++++SPAWN2++++++++++++++++++++++++++++++++++");
        stopEnemy();
        for(int i = 0; i < 8; i++){
            if(randomNumber() <= difficolta){
                enemy[nEnemy] = spawnEnemy(i);
                winWin.add(enemy[nEnemy].enemyLabel);
                enemy[nEnemy].start();

                nEnemy++;
            }
        }
        return 0;
    }

    private Enemy spawnEnemy(int i){
        System.out.println("++++++++++++++++++++SPAWN1++++++++++++++++++++++++++++++++++");
        Enemy a = new Enemy(newEnemyLable(i), streetSpeed[i], Boolean.parseBoolean(enemyInformationArr[i][3]), winWin, player);
        return a;
    }

    private int randomNumber(){
        int x = (int) (Math.random()*10);
        return x;
    }

    private JLabel newEnemyLable(int i){
        System.out.println("++++++++++++++++++++LABLE++++++++++++++++++++++++++++++++++");
        JLabel x = new JLabel(new ImageIcon(enemyInformationArr[i][0]));
        x.setSize(Integer.parseInt(enemyInformationArr[i][1]), Integer.parseInt(enemyInformationArr[i][2]));
        if(Boolean.parseBoolean(enemyInformationArr[i][3])){
            x.setLocation(0, street[i].getLocation().y);
        }else{
            x.setLocation(winWin.getBounds().width, street[i].getLocation().y);
        }

        enemyLabel[nEnemy] = x;

        return x;
    }

    public void  stopEnemy(){
        for(int i = 0; i < enemy.length; i++){
            if(enemy[i] != null){
                enemy[i].stop();
                enemy[i] = null;

                enemyLabel[i].setVisible(false);
                enemyLabel[i] = null;
            }
        }
    }

}
