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
    
    //Faire un get nb Specie Still Alive
}
