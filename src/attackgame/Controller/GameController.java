/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

//<<<<<<< HEAD
import attackgame.Model.Map;
import attackgame.Model.Registre_Element;
//=======
import attackgame.Model.Cat;
import attackgame.Model.Map;
import attackgame.View.ControlFrame;
//>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8
import attackgame.View.Game;
import attackgame.View.GameTest;
import attackgame.View.MenuView;

/**
 *
 * @author joris
 */
public class GameController {

    private static GameController gameControllerInstance = null;
    private static Game game = new Game();
    private static GameTest gameTest = new GameTest();
    private static ControlFrame controlFrame = new ControlFrame();
  
    public GameController() {
        //game = new Game();
        //game.setVisible(true);
        //gameTest = new GameTest();
        gameTest.setVisible(true);
        //controlFrame.setVisible(true);
        
//<<<<<<< HEAD
        Registre_Element.getInstance().remplirList();
//        Registre_Element registre =  new Registre_Element();
//        registre.remplirList();
        Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
        Map.getInstance().drawMap(Map.getInstance().getMap());
//        for (int i = 0; i < registre.listElements.size(); i++) {
//            registre.listElements.get(i).move_right(); 
//            System.out.println(registre.listElements.get(i).posy);
//        }
//        
//        Map.getInstance().remplirMap(registre.listElements);
//        Map.getInstance().afficherMap();
        
        
//        Cat cat1 = new Cat(5,6);
//        Map.getInstance().drawMap(Map.getInstance().getMap());
        //Map.getInstance().setMap(map[cat1.posx][cat1.posy]);
        
        //Initialise la map (graphiquement)
//        for (int i = 0; i < Map.getInstance().getMap().length ; i++) {
//            for (int j = 0; j < Map.getInstance().getMap()[1].length; j++) {
//                
//                System.out.println("");
//            }
//            System.out.println("");
//        }
//>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8
    }

    public static GameController getInstance() {
        if (gameControllerInstance == null) {
            gameControllerInstance = new GameController();
        }
        return gameControllerInstance;
    }
    
    public void moveController(int choice, Registre_Element registre)
    {
        switch(choice){
            case 1:
                registre.moveAll_up();
                Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
                Map.getInstance().drawMap(Map.getInstance().getMap());
                break;
            case 2:
                registre.moveAll_down();
                Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
                Map.getInstance().drawMap(Map.getInstance().getMap());
                break;
            case 3:
                registre.moveAll_left();
                Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
                Map.getInstance().drawMap(Map.getInstance().getMap());
                break;
            case 4:
                registre.moveAll_right();
                Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
                Map.getInstance().drawMap(Map.getInstance().getMap());
                break;
        }
    }
    
    //Condition de fin de jeu

    
//    public boolean goalTest() {
//        //S'il ne reste plus qu'une espèce d'animal sur la map (soit compter le nb d'espèce encore en vie
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
