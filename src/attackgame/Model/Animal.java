/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

/**
 *
 * @author joris
 */
public abstract class Animal extends Element {
    //test
    public int sex; 
    Action action = new Action();
    public int move ;
    public boolean carnivore;
    public String attack;
    
    public void move_down()
    {
        action.move_down(this);
    }
    
    public void move_up()
    {
        action.move_up(this);
    }
    public void move_left()
    {
        action.move_left(this);
    }
    public void move_right()
    {
        action.move_right(this);
    }
    //Faire un get nb Specie Still Alive
}
