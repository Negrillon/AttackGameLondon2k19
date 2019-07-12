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
    
    public void move_up(){}

    public void move_down(){}

    public void move_left(){}

    public void move_right(){}
    
    public boolean attack(Element a2){return false;}
}