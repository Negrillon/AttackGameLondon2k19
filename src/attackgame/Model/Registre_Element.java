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
    
    private static Registre_Element Registre_ElementInstance = null;
    
    public ArrayList<Element> listElements = new ArrayList<Element>();
    
    public static Registre_Element getInstance() {
        if(Registre_ElementInstance == null) {
            Registre_ElementInstance = new Registre_Element();
        }
        return Registre_ElementInstance;
    }
    
    public void remplirList()
    {
        Element chat = new Cat(0,0);
        listElements.add(chat);
        
    }
    
    public void moveAll_up(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_up();
            map.remplirMap(this.listElements);
            map.drawMap(map.getMap());
        }
    }
    
    public void moveAll_down(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_down();
            map.remplirMap(this.listElements);
            map.drawMap(map.getMap());
        } 
    }
    
    public void moveAll_left(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_left();
            map.remplirMap(this.listElements);
            map.drawMap(map.getMap());
        } 
    }
    
    public void moveAll_right(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_right();
            map.remplirMap(this.listElements);
            map.drawMap(map.getMap());
        } 
    }


}
