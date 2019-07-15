/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Controller;

import attackgame.View.Beginning;

/**
 *
 * @author joris
 */
public class BeginningController {
    
//    private static BeginningController beginningControllerInstance = null;
    private static Beginning beginning;

    public BeginningController() {
        beginning = new Beginning();
        
    }
    
    
    
//    public static BeginningController getInstance() {
//        if (beginningControllerInstance == null) {
//            beginningControllerInstance = new BeginningController();
//        }
//        return beginningControllerInstance;
//    }
    
}
