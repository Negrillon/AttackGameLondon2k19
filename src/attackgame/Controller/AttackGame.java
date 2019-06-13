/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import attackgame.View.MenuTest;
import attackgame.Model.Map;
import attackgame.View.MenuView;
import java.awt.Color;
import java.util.EventListener;

/**
 *
 * @author joris
 */
public class AttackGame {

    /**
     * @param args the command line arguments
     */
    static public MenuView menu;
    //public Game game = null;

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Main");

        MenuController.getInstance();

//            do{
//                System.out.println("Rentre DO");
//                if (menuController.play==true) {
//                    System.out.println("OK");
//                    menuController.Play();
//                  
//                }
//            }while(menuController.play==false);
        //menuController.Initialisation();
        /*
        MenuController menuController = new MenuController();
        MenuTest menu = new MenuTest();
        menu.setVisible(true);
         */
    }

    /*
        int choiceRow=0, choiceColumn=0;
        choiceRow =Integer.parseInt(menu.choiceRow.getItem(menu.choiceRow.getX())); 
        System.out.println(choiceRow);
     */
 /*
    public interface mapListener extends EventListener {
        
    }*/
}
