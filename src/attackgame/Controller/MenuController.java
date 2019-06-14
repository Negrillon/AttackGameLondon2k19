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
    //private Map mapModel = new Map();

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

    public static int getLvlChoose() {
        return lvlChoose;
    }

    public static void setLvlChoose(int lvlChoose) {
        MenuController.lvlChoose = lvlChoose;
    }

    public void Play() {
        System.out.println("Game loading");
        GameController.getInstance();
        menu.dispose();
        
        //Test pour vérifier la dimension du tabbleau
//        System.out.println(Map.getInstance().getMap().length);
//        System.out.println(Map.getInstance().getMap()[1].length);
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
