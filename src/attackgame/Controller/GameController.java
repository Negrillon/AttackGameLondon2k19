/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import attackgame.Model.Cat;
import attackgame.Model.Map;
import attackgame.View.Game;
import attackgame.View.MenuView;

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
        
        Cat cat1 = new Cat(5,6);
        Map.getInstance().drawMap(Map.getInstance().getMap(), game);
        //Map.getInstance().setMap(map[cat1.posx][cat1.posy]);
        
        //Initialise la map (graphiquement)
//        for (int i = 0; i < Map.getInstance().getMap().length ; i++) {
//            for (int j = 0; j < Map.getInstance().getMap()[1].length; j++) {
//                
//                System.out.println("");
//            }
//            System.out.println("");
//        }
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
