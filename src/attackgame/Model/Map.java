/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import attackgame.View.Game;

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
    
    public void setMap(int x, int y, int value){
        this.map[x][y]= value;
    }

    public static Map getInstance() {
        if (mapInstance == null) {
            mapInstance = new Map();
        }
        return mapInstance;
    }

    public void drawMap(int[][] map, Game game) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[1].length; j++) {
                System.out.print(this.getMap()[i][j]);
                
            }
            System.out.println();
        }
    }
    
    public void initialisationMapTest(int[][] map){
        
    }
}
