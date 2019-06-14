/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import attackgame.View.Game;
>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8

/**
 *
 * @author joris
 */
public class Map {

    private static Map mapInstance = null;
    private static int[][] map;

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public static Map getInstance() {
        if (mapInstance == null) {
            mapInstance = new Map();
        }
        return mapInstance;
    }
<<<<<<< HEAD
    
    public void afficherMap()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[1].length; j++)
            {    
                System.out.print(map[i][j]);
=======

    public void drawMap(int[][] map, Game game) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[1].length; j++) {
                System.out.print(this.getMap()[i][j]);
                
>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8
            }
            System.out.println();
        }
    }
    
<<<<<<< HEAD
    public void remplirMap(ArrayList<Element> listElements)
    {
        for (int i = 0; i < listElements.size(); i++) {
            
            int x = listElements.get(i).posx;
            int y = listElements.get(i).posy;
            Map.getInstance().getMap()[x][y] = 1;
        }
        
    }
    
=======
    public void initialisationMapTest(int[][] map){
        
    }
>>>>>>> b51fc55d7680903728635976eb3b0b50a43dc5b8
}
