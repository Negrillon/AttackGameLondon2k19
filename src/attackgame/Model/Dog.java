/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import java.util.Random;

/**
 *
 * @author Roman
 */
public class Dog extends Animal{
        
    public Dog(int posx, int posy) {
        name = "Dog" ;
        move = 3 ;
        carnivore = true ; 
        this.posx = posx;
        this.posy = posy;
    }
}
