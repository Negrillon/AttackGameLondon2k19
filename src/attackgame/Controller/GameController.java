/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import attackgame.Model.Map;
import attackgame.Model.Registre_Element;
import attackgame.View.Game;

/**
 *
 * @author joris
 */
public class GameController {

    private static GameController gameControllerInstance = null;
    private static Game game = new Game();

    public GameController() {
        game = new Game();
        game.setVisible(true);
        /*Registre_Element registre =  new Registre_Element();
        registre.remplirList();
        Map.getInstance().remplirMap(registre.listElements);
        Map.getInstance().afficherMap();
        for (int i = 0; i < registre.listElements.size(); i++) {
            registre.listElements.get(i).move_right(); 
            System.out.println(registre.listElements.get(i).posy);
        }
        
        Map.getInstance().remplirMap(registre.listElements);
        Map.getInstance().afficherMap();*/
        
        
    }

    public static GameController getInstance() {
        if (gameControllerInstance == null) {
            gameControllerInstance = new GameController();
        }
        return gameControllerInstance;
    }

    
//    public boolean goalTest() {
//        //S'il ne reste plus qu'une espèce d'animal sur la map (soit compter le nb d'espèce encore en vie
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
