/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import static attackgame.Controller.AttackGame.menu;
import attackgame.Model.Map;
import attackgame.View.MenuView;
import attackgame.View.MenuTest;
import java.awt.Color;

/**
 *
 * @author joris
 */
public class MenuController {

    private static MenuController menuControllerInstance = null;
    private static MenuView menuView = new MenuView();
    private Map mapModel = new Map();
    
    static int lvlChoose = 0;
    boolean play = false;

    public MenuController() {
        menu = new MenuView();
        menu.setVisible(true);
    }

    public static MenuController getInstance() {
        if (menuControllerInstance == null) {
            menuControllerInstance = new MenuController();
        }
        return menuControllerInstance;
    }

    public void Play() {
        System.out.println("Game loading");
        GameController.getInstance();
        menu.dispose();
        System.out.println(Map.getInstance().getMap().length);
        System.out.println(Map.getInstance().getMap()[1].length);
        
        //Création-Initialisation Map
       // System.out.println(menuView.jComboBox1.getItemAt(menuView.jComboBox1.getSelectedIndex()));
        //System.out.println(menuView.choiceRow.getSelectedIndex());
        //mapModel.setMap(new int[Integer.parseInt(menuView.choiceRow.)][]);
        //System.out.println(mapModel.map.length);
        //System.out.println(mapModel.map[1].length);
    }

    public void checkClickPlay() {
        if (this.isPlay()) {
            this.Play();
        }
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }
}
