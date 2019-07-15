/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

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
        for(int i = 0 ; i<2 ; i++)
        {
            listElements.add(randAnimal());
        }
//        Element chat = new Cat(0,0);
//        Element chien = new Dog(4,4);
//        listElements.add(chat);
//        listElements.add(chien);
        
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
                    if (this.listElements.get(i).name.equals(this.listElements.get(j).name))
                    {
                       if(this.listElements.get(i).reproduct()  && this.listElements.get(j).reproduct())
                        {
                            newAnimal(this.listElements.get(i));
                        }
                    }
                    else if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else if(!this.listElements.get(i).attack(this.listElements.get(j)))
                    {        
                        this.listElements.remove(j);
                    }
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
                    if (this.listElements.get(i).name.equals(this.listElements.get(j).name))
                    {
                        if(this.listElements.get(i).reproduct()  && this.listElements.get(j).reproduct())
                        {
                            newAnimal(this.listElements.get(i));
                        }
                    }
                    else if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else if(!this.listElements.get(i).attack(this.listElements.get(j)))
                    {        
                        this.listElements.remove(j);
                    }
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
                    if (this.listElements.get(i).name.equals(this.listElements.get(j).name))
                    {
                        if(this.listElements.get(i).reproduct()  && this.listElements.get(j).reproduct())
                        {
                            newAnimal(this.listElements.get(i));
                        }
                    }
                    else if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else if(!this.listElements.get(i).attack(this.listElements.get(j)))
                    {        
                        this.listElements.remove(j);
                    }
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
                    if (this.listElements.get(i).name.equals(this.listElements.get(j).name))
                    {
                        if(this.listElements.get(i).reproduct() && this.listElements.get(j).reproduct())
                        {
                            newAnimal(this.listElements.get(i));
                        }
                    }
                    else if (this.listElements.get(i).attack(this.listElements.get(j)))
                    {
                        this.listElements.remove(i);
                    }
                    else if(!this.listElements.get(i).attack(this.listElements.get(j)))
                    {        
                        this.listElements.remove(j);
                    }
                }
            }
        }
        map.remplirMap(this.listElements);
        map.drawMap(map.getMap());        
    }

    private boolean collision(Element e1, Element e2)
    {
        if(e1.posx==e2.posx && e1.posy==e2.posy)
        {
            return true;
        }
        else return false;
    }
    
    private Element randAnimal()
    {
        Random rand = new Random();
        int a = rand.nextInt(2);
        int posx = rand.nextInt(Map.getInstance().getMap().length);
        int posy = rand.nextInt(Map.getInstance().getMap()[0].length);
        switch (a)
        {
            case 0:
                Element chat = new Cat(posx,posy);
                return chat;
               
            case 1:
                Element chien = new Dog(posx,posy);
                return chien;
        }
        return null;
        
    }
    
    private void newAnimal(Element a)
    {
        if ("Cat".equals(a.name))
        {
            Element chat = new Cat(a.posx,a.posy);
            chat.set_sleep(true);
            this.listElements.add(chat);
        }
        if ("Dog".equals(a.name))
        {
            Element chien = new Dog (a.posx,a.posy);
            chien.set_sleep(true);
            this.listElements.add(chien);
            
        }
        
    }
    

}
