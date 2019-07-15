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
    Action action = new Action();
    public int move ;
    public boolean carnivore;
   
    @Override
    public void move_down()
    {
        action.move_down(this);
    }
    @Override
    public void move_up()
    {
        action.move_up(this);
    }
    @Override
    public void move_left()
    {
        action.move_left(this);
    }
    @Override
    public void move_right()
    {
        action.move_right(this);
    }
    @Override
    public boolean attack(Element a2)
    {
        return action.attack(this,  a2);
    }
    @Override
    public boolean reproduct()
    {
        return action.reproductible(this);
    }
    //Faire un get nb Specie Still Alive
}
