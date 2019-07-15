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
public class Score {
    
    private static int nbMoves = 0;
    private static int nbAnimal =0;

    public static int getNbSpecies() {
        return nbAnimal;
    }

    public static void setNbSpecies(int nbSpecies) {
        Score.nbAnimal = nbSpecies;
    }

    public static int getNbMoves() {
        return nbMoves;
    }

    public static void setNbMoves(int nbMoves) {
        Score.nbMoves = nbMoves;
    }
    
    
}
