/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.View;

import attackgame.Model.Map;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author joris
 */
public class GamePanel extends JPanel {

    public GamePanel() {
        System.out.println("TEST GAME PANEL");
    }

    @Override
    public void paintComponent(Graphics g) {
        //g.fillRect(100, 100, 700, 700);
        for (int i = 0; i < Map.getInstance().getMap().length; i++) {
            for (int j = 0; j < Map.getInstance().getMap()[1].length; j++) {
                

            }

        }

    }
}
