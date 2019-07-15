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
public class Wolf extends Animal{
        public Wolf(int posx, int posy) {
        name = "Wolf" ;
        move = 4 ;
        carnivore = true ; 
        this.posx = posx;
        this.posy = posy;
    }
}
