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
        public Cow(int posx, int posy,int niveau) {
        name = "Cow" ;
        move = 2 ;
        carnivore = false ; 
        this.posx = posx;
        this.posy = posy;
        switch (niveau)
        {
            case 1:
                life=1;
                break;
            case 2:
                life=3;
                break;
            case 3:
                life=1;
                break;
        }
    }
}
