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
public class Obstacle extends Element{
    public Obstacle(int posx, int posy)
    {        
        name = "Obstacle" ;
        this.posx = posx;
        this.posy = posy;
    }
    
}
