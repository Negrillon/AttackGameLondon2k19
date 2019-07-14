/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.View;

import attackgame.Model.Map;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author joris
 */
public class GamePanel extends JPanel {

    private int[][] map;
    ImageIcon image0 = new ImageIcon("./src/Ressources/cat.png");

    public GamePanel(int[][] mapLoad) {
        this.map = mapLoad;
        System.out.println("TEST GAME PANEL");

    }

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("paint component");

        for (int i = 0; i < Map.getInstance().getMap().length; i++) {
            for (int j = 0; j < Map.getInstance().getMap()[0].length; j++) {
                switch (Map.getInstance().getMap()[i][j]) {
                    case 0:
                        g.drawImage(image0.getImage(), j, i, null);
                        System.out.println("OK");
                        break;
//                    case 1:
//                        graphics.drawImage(image1.getImage(), j * 20, i * 20, null);
//                        break;
//                    case 2:
//                        graphics.drawImage(image2.getImage(), j * 20, i * 20, null);
//                        break;
//                    case 3:
//                        graphics.drawImage(image3.getImage(), j * 20, i * 20, null);
//                        break;
//                    case 4:
//                        graphics.drawImage(image4.getImage(), j * 20, i * 20, null);
//                        break;
//                    case 5:
//                        graphics.drawImage(image5haut.getImage(), j * 20, i * 20, null);
//                        break;
                }
            }

            //TEST
//        g.setColor(Color.orange);
//        g.fillRect(0,0, getWidth(), getHeight());
//        g.setColor(Color.red);
//        g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
//COMMENT
//        g.drawImage(image0.getImage(), 1*getHeight(), 1*getWidth(), null);
//        for (int i = 0; i < Map.getInstance().getMap().length; i++) {
//            for (int j = 0; j < Map.getInstance().getMap()[1].length; j++) {
//                switch (Map.getInstance().getMap()[i][j]) {
//                    case 0:
//                        g.drawImage(image0.getImage(), getWidth(), getHeight(), null);
//                        break;
//                      g.drawImage(image0.getImage(), j*(100/Map.getInstance().getMap().length),i*(100/Map.getInstance().getMap()[1].length), null);
            //g.drawImage(image0.getImage(), get, j , null);
            //System.out.println(image0.getImage());
//COMENT
        }
    }
}
//        }
//    }
//}
//*(getHeight()/this.map[0].length
//*(getWidth()/this.map.length)
