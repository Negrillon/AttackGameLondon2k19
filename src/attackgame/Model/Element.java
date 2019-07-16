/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

/**
 *
 * @author Roman
 */
public abstract class Element
{
    public int posx ;
    public int posy ; 
    public String name ;
    public String attack;
    public boolean sleep=false;
    public boolean reproduct=true;
    public boolean toxic;
    public int life;
    public boolean carnivore;
    
    public void move_up(){}

    public void move_down(){}

    public void move_left(){}

    public void move_right(){}
    
    public void attack(Element a2){}
    
    public boolean reproduct(){return false;}
    
    public void set_reproduct(boolean a){this.reproduct=a;}
    
    public void set_sleep(boolean a){this.sleep=a;}
}