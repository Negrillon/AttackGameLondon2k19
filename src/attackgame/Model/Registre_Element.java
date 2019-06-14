/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Roman
 */
public class Registre_Element {
    public ArrayList<Element> listElements = new ArrayList<Element>();
    
    
    public void remplirList()
    {
        Element chat = new Cat(0,0);
        listElements.add(chat);
        
    }
    
    

}
