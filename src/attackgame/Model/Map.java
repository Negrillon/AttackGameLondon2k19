/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import java.util.ArrayList;
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

    public void setMap(int x, int y, int value) {
        this.map[x][y] = value;
    }

    public static Map getInstance() {
        if (mapInstance == null) {
            mapInstance = new Map();
        }
        return mapInstance;
    }

    public void afficherMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[1].length; j++) {
                System.out.print(map[i][j]);
            }
        }
    }

    public void drawMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[1].length; j++) {
                System.out.print(this.getMap()[i][j]);
            }
            System.out.println();
        }
    }

    public void remplirMap(ArrayList<Element> listElements) {
        for (int i = 0; i < listElements.size(); i++) {

            int x = listElements.get(i).posx;
            int y = listElements.get(i).posy;
            if ("Cat".equals(listElements.get(i).name))
            {
                Map.getInstance().getMap()[x][y] = 1;
            }
            else Map.getInstance().getMap()[x][y] = 9;
        }

    }

    public void initialisationMapTest(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                Map.getInstance().getMap()[i][j]=0;
            }

        }
    }
}
