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
public class Cat extends Animal {
    
    Random rand = new Random();
    
    
    public Cat(int posx, int posy) {
        name = "Cat" ;
        move = 4 ;
        carnivore = true ;
        sex = rand.nextInt(2);  
        this.posx = posx;
        this.posy = posy;
    }
    
}
