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
    
    
    public Cat(int posx, int posy, int niveau) {
        name = "Cat" ;
        move = 5 ;
        carnivore = true ;  
        this.posx = posx;
        this.posy = posy;
        switch (niveau)
        {
            case 1:
                life=1;
                break;
            case 2:
                life=1;
                break;
            case 3:
                life=1;
                break;
        }
    }
    
}
