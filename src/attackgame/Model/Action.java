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
        int a;
        if(a1.sleep)
        {
            a = 0;
            a1.set_sleep(false);
        }
        else a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;

        for(int i = 0 ; i < a ; i++)
        {   
            for (int j=0 ; j<Registre_Element.getInstance().listObstacles.size();j++)
            {
                if(a1.posx-1==Registre_Element.getInstance().listObstacles.get(j).posx && a1.posy==Registre_Element.getInstance().listObstacles.get(j).posy)
                {
                    return;
                }
                else;
            }
            if (a1.posx-a>0)
            {
                a1.posx-=1 ;
            }
            else a1.posx=0;
        }
    }
        
    
    
    public void move_right (Animal a1)
    {
        int a;
        if(a1.sleep)
        {
            a = 0;
            a1.set_sleep(false);
        }
        else a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        for(int i = 0 ; i < a ; i++)
        {
            for (int j=0 ; j<Registre_Element.getInstance().listObstacles.size();j++)
            {
                if(a1.posx==Registre_Element.getInstance().listObstacles.get(j).posx && a1.posy+1==Registre_Element.getInstance().listObstacles.get(j).posy)
                {
                    return;
                }
                else;
            }
            if(a1.posy+a<Map.getInstance().getMap()[0].length)
            {    
                a1.posy+=1 ;
            }
            else a1.posy=Map.getInstance().getMap()[0].length-1;
        }
    }
    
    public void move_left (Animal a1)
    {
        int a;
        if(a1.sleep)
        {
            a = 0;
            a1.set_sleep(false);
        }
        else a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        for(int i = 0 ; i < a ; i++)
        {
            for (int j=0 ; j<Registre_Element.getInstance().listObstacles.size();j++)
            {
                if(a1.posx==Registre_Element.getInstance().listObstacles.get(j).posx && a1.posy-1==Registre_Element.getInstance().listObstacles.get(j).posy)
                {
                    return;
                }
                else;
            }
            
            if (a1.posy-a>0)
            {
                a1.posy-=1 ;  
            }
            else a1.posy=0;
        }
    }
    
    public void move_down (Animal a1)
    {
        int a;
        if(a1.sleep)
        {
            a = 0;
            a1.set_sleep(false);
        }
        else a = rand.nextInt(a1.move);
        Map.getInstance().getMap()[a1.posx][a1.posy] = 0;
        for(int i = 0 ; i < a ; i++)
        {
            for (int j=0 ; j<Registre_Element.getInstance().listObstacles.size();j++)
            {
                if(a1.posx+1==Registre_Element.getInstance().listObstacles.get(j).posx && a1.posy==Registre_Element.getInstance().listObstacles.get(j).posy)
                {
                    return;
                }
                else;
            }
            if(a1.posx+a<Map.getInstance().getMap().length)
            {
                a1.posx+=1 ;
            }
            else a1.posx=Map.getInstance().getMap().length-1;
        }
    }
    
    public void attack (Animal a1, Element a2)
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
                break;
            case 2:
                a2.attack = "Scratch";
                break;
        }
        if(a1.sleep)
        {
            a1.life-=1;
            return ;
        }
        else if(a2.sleep)
        {
            a2.life-=1;
            return;
        }
        else if ("Roar".equals(a1.attack) && "Scratch".equals(a2.attack) || "Bite".equals(a1.attack) && "Roar".equals(a2.attack) || "Scratch".equals(a1.attack) && "Bite".equals(a2.attack))
        {
            System.out.println("The "+a1.name+" use "+a1.attack);
            System.out.println("The "+a2.name+" use "+a2.attack);
            System.out.println("The "+a1.name+" hurts the "+a2.name);
            a2.life-=1;
            return;
            
        }
        else if("Roar".equals(a2.attack) && "Scratch".equals(a1.attack)|| "Bite".equals(a2.attack) && "Roar".equals(a1.attack) || "Scratch".equals(a2.attack) && "Bite".equals(a1.attack))
        {
            System.out.println("The "+a1.name+" use "+a1.attack);
            System.out.println("The "+a2.name+" use "+a2.attack);
            System.out.println("The "+a2.name+" hurts the "+a1.name);
            a1.life-=1;
            return;
                   
        }
        a = rand.nextInt(2);
        switch (a)
        {
            case 0:
                System.out.println("The "+a1.name+" use "+a1.attack);
                System.out.println("The "+a2.name+" use "+a2.attack);
                System.out.println("The "+a1.name+" hurts the "+a2.name);
                a2.life-=1;
                return;
                              
            case 1:
                System.out.println("The "+a1.name+" use "+a1.attack);
                System.out.println("The "+a2.name+" use "+a2.attack);
                System.out.println("The "+a2.name+" hurts the "+a1.name);
                a1.life-=1;
                return;
                   
        }
        
    }
    
    public boolean reproductible(Animal a1)
    {
        
        if (a1.reproduct==true)
        {
            a1.set_sleep(true);
            a1.set_reproduct(false);
            return true;
        }
        else return false;
    }
}
