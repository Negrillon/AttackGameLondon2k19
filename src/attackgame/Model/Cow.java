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
public class Cow extends Animal {
        public Cow(int posx, int posy) {
        name = "Cow" ;
        move = 2 ;
        carnivore = false ; 
        this.posx = posx;
        this.posy = posy;
    }
}
