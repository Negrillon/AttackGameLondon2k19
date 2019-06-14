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
        a1.posx-=a ;  
    }
    
    public void move_right (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        a1.posy+=a ;       
    }
    
    public void move_left (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        a1.posy-=a ;  
    }
    
    public void move_down (Animal a1)
    {
        int a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        a1.posx+=a ;
    }
    
    public void attack (Animal a1, Animal a2)
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
            
        }
        else if("Roar".equals(a2.attack) && "Scratch".equals(a1.attack)|| "Bite".equals(a2.attack) && "Roar".equals(a1.attack) || "Scratch".equals(a2.attack) && "Bite".equals(a1.attack))
        {
                    
        }
        else ;
        
        
    }

}
