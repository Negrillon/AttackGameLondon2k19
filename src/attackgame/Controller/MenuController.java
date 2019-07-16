/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

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
    private static MenuView menuView;
    //private Map mapModel = new Map();

    private static int lvlChoose = 0;
    private static int nbAnimal = 0;
    private static int nbRow = 0;
    private static int nbColumn = 0;
    private boolean play = false;

    public MenuController() {
        menuView = new MenuView();
       
    }

    public static MenuController getInstance() {
        if (menuControllerInstance == null) {
            menuControllerInstance = new MenuController();
        }
        return menuControllerInstance;
    }

    public static int getNbAnimal() {
        return nbAnimal;
    }

    public static void setNbAnimal(int nbSpecies) {
        MenuController.nbAnimal = nbSpecies;
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
        //menuView.dispose();
//<<<<<<< HEAD
        System.out.println(Map.getInstance().getMap().length);
        System.out.println(Map.getInstance().getMap()[1].length);

        //Création-Initialisation Map
        // System.out.println(menuView.jComboBox1.getItemAt(menuView.jComboBox1.getSelectedIndex()));
        //System.out.println(menuView.choiceRow.getSelectedIndex());
        //mapModel.setMap(new int[Integer.parseInt(menuView.choiceRow.)][]);
        //System.out.println(mapModel.map.length);
        //System.out.println(mapModel.map[1].length);
//=======
        //Test pour vérifier la dimension du tabbleau
//        System.out.println(Map.getInstance().getMap().length);
//        System.out.println(Map.getInstance().getMap()[1].length);
//>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8
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
