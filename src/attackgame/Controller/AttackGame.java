/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import attackgame.View.MenuTest;
import attackgame.Model.Map;
import attackgame.View.Beginning;
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
    static public BeginningController beginningController;

    public static void main(String[] args) {
        // TODO code application logic here
        
        beginningController = new BeginningController();
        //MenuController.getInstance();

    }
}
