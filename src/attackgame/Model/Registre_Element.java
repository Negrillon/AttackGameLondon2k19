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
        Element chien = new Dog(4,4);
        listElements.add(chat);
        listElements.add(chien);
        
    }
    
    public void moveAll_up(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_up();
        }
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            for(int j = 0 ; j < this.listElements.size() ; j++)
            {
                if(collision( this.listElements.get(i), this.listElements.get(j)) && i != j)
                {
                    if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(j);
                    }
                    else this.listElements.remove(i);
                }
            }
        }
        map.remplirMap(this.listElements);
        map.drawMap(map.getMap());
    }
    
    public void moveAll_down(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_down();
        } 
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            for(int j = 0 ; j < this.listElements.size() ; j++)
            {
                if(collision( this.listElements.get(i), this.listElements.get(j)) && i != j)
                {
                    if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else this.listElements.remove(j);
                }
            }
        }
        map.remplirMap(this.listElements);
        map.drawMap(map.getMap());
    }
    
    public void moveAll_left(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_left();
        } 
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            for(int j = 0 ; j < this.listElements.size() ; j++)
            {
                if(collision( this.listElements.get(i), this.listElements.get(j)) && i != j)
                {
                    if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else this.listElements.remove(j);
                }
            }
        }
        map.remplirMap(this.listElements);
        map.drawMap(map.getMap());
    }
    
    public void moveAll_right(Map map)
    {
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            this.listElements.get(i).move_right();
        }
        for(int i = 0 ; i < this.listElements.size() ; i++)
        {
            for(int j = 0 ; j < this.listElements.size() ; j++)
            {
                if(collision( this.listElements.get(i), this.listElements.get(j)) && i != j)
                {
                    if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else this.listElements.remove(j);
                }
            }
        }
        map.remplirMap(this.listElements);
        map.drawMap(map.getMap());        
    }

    public boolean collision(Element e1, Element e2)
    {
        if(e1.posx==e2.posx && e1.posy==e2.posy)
        {
            return true;
        }
        else return false;
    }


}
