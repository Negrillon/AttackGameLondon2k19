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
    ImageIcon ground = new ImageIcon("./src/Ressources/ground.png");
    ImageIcon cat = new ImageIcon("./src/Ressources/cat.png");
    ImageIcon dog = new ImageIcon("./src/Ressources/dog.png");
    ImageIcon wolf = new ImageIcon("./src/Ressources/wolf.png");
    ImageIcon cow = new ImageIcon("./src/Ressources/cow.png");
    ImageIcon chicken = new ImageIcon("./src/Ressources/chicken.png");
    ImageIcon herb = new ImageIcon("./src/Ressources/herb.png");
    ImageIcon tree = new ImageIcon("./src/Ressources/tree.png");
    
    int nbWidth =0;
    int nbHeight=0;

    public GamePanel(int[][] mapLoad) {
        this.map = mapLoad;
        System.out.println("TEST GAME PANEL");

    }

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("paint component");
        System.out.println("WIDTH :" + this.getWidth() + "   HEIGHT:" + this.getHeight());
        
        nbWidth=600/map.length;
        nbHeight=600/map[0].length;
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                switch (map[i][j]) {
                    case 0:
                        g.drawImage(ground.getImage(), 25 * j, 25 * i, null);
                        break;
                    case 1:
                        g.drawImage(cat.getImage(), j * 25, i * 25, null);
                        break;
                    case 2:
                        g.drawImage(dog.getImage(), j * 25, i * 25, null);
                        break;
                    case 3:
                        g.drawImage(wolf.getImage(), 25 * j, 25 * i, null);
                        break;
                        case 4:
                        g.drawImage(cow.getImage(), 25 * j, 25 * i, null);
                        break;
                    case 5:
                        g.drawImage(chicken.getImage(), j * 25, i * 25, null);
                        break;
                    case 6:
                        g.drawImage(herb.getImage(), j * 25, i * 25, null);
                        break;
                    case 7:
                        g.drawImage(tree.getImage(), j * 25, i * 25, null);
                        break;
                }
            }
        }
    }
}
