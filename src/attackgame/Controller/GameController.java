/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

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
