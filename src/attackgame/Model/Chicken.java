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
public class Chicken extends Animal{
        public Chicken(int posx, int posy) {
        name = "Chicken" ;
        move = 3 ;
        carnivore = false ; 
        this.posx = posx;
        this.posy = posy;
    }
}
