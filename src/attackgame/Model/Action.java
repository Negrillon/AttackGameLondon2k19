/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import java.util.Random;

/**
 *
 * @author roman
 */

public class Action{
    Random rand = new Random();
    
    public void move_up (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        if (a1.posx-a>=0)
        {
            a1.posx-=a ;  
        }
        else a1.posx=0;
    }
    
    public void move_right (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        if(a1.posy+a<Map.getInstance().getMap()[0].length)
        {    
            a1.posy+=a ;
        }
        else a1.posy=Map.getInstance().getMap()[0].length-1;
    }
    
    public void move_left (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        if (a1.posy-a>=0)
        {
            a1.posy-=a ;  
        }
        else a1.posy=0;
    }
    
    public void move_down (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        if(a1.posx+a<Map.getInstance().getMap().length)
        {
            a1.posx+=a ;
        }
        else a1.posx=Map.getInstance().getMap().length-1;
    }
    
    public boolean attack (Animal a1, Element a2)
    {
        int a = rand.nextInt(3);
        switch (a)
        {
            case 0:
                a1.attack = "Roar";
                break;
            case 1:
                a1.attack = "Bite";
                break;
            case 2:
                a1.attack = "Scratch";
                break;
        }
        
        a = rand.nextInt(3);
        switch (a)
        {
            case 0:
                a2.attack = "Roar";
                break;
            case 1:
                a2.attack = "Bite";
            case 2:
                a2.attack = "Scratch";
        }
        
        if ("Roar".equals(a1.attack) && "Scratch".equals(a2.attack) || "Bite".equals(a1.attack) && "Roar".equals(a2.attack) || "Scratch".equals(a1.attack) && "Bite".equals(a2.attack))
        {
            return true;
        }
        else if("Roar".equals(a2.attack) && "Scratch".equals(a1.attack)|| "Bite".equals(a2.attack) && "Roar".equals(a1.attack) || "Scratch".equals(a2.attack) && "Bite".equals(a1.attack))
        {
             return false;       
        }
        else ;
        return false;
        
        
    }

}
