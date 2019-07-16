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
    public static int[][] map;

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

    public void remplirMap() {
        for (int i = 0; i < Registre_Element.getInstance().listPlants.size(); i++) 
        {
            int x = Registre_Element.getInstance().listPlants.get(i).posx;
            int y = Registre_Element.getInstance().listPlants.get(i).posy;
            Map.getInstance().getMap()[x][y] = 6;
        }
        for (int i = 0; i < Registre_Element.getInstance().listElements.size() ; i++) 
        {
            int x = Registre_Element.getInstance().listElements.get(i).posx;
            int y = Registre_Element.getInstance().listElements.get(i).posy;
            switch(Registre_Element.getInstance().listElements.get(i).name)
            {
                case "Cat":
                    Map.getInstance().getMap()[x][y] = 1;
                    break;
                case "Dog":
                    Map.getInstance().getMap()[x][y] = 2;
                    break;
                case "Wolf":
                    Map.getInstance().getMap()[x][y] = 3;
                    break;
                case "Cow":
                    Map.getInstance().getMap()[x][y] = 4;
                    break;
                case "Chicken":
                    Map.getInstance().getMap()[x][y] = 5;
                    break;
                 
            }
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
