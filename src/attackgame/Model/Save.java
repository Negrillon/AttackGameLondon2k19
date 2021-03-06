/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.Model;

import attackgame.Controller.MenuController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author joris
 */
public class Save {

    public static void createFile() {
        try {
            File fichier = new File("./src/Ressources/Save.txt");
            if (fichier.exists()) {
                fichier.delete();
            }

            if (fichier.createNewFile()) {
                System.out.println("fichier créé");
            } else {
                System.out.println("fichier non créé");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        String nameFile = "./src/Ressources/Save.txt";
        try {
            PrintWriter out = new PrintWriter(new FileWriter(nameFile));
            switch (MenuController.getLvlChoose()) {
                case 1:
                    for (int i = 0; i < Registre_Element.getInstance().listElements.size(); i++) {
                        out.println(Registre_Element.getInstance().listElements.get(i).name + ";" + Registre_Element.getInstance().listElements.get(i).posx + ";" + Registre_Element.getInstance().listElements.get(i).posy + ";" + Registre_Element.getInstance().listElements.get(i).reproduct + ";" + Registre_Element.getInstance().listElements.get(i).sleep + ";" + Map.getInstance().getMap().length + ";" + Map.getInstance().getMap()[0].length + ";" + MenuController.getLvlChoose() + ";" + Score.getNbMoves() + ";" + Registre_Element.getInstance().listPlants.get(i).posx + ";" + Registre_Element.getInstance().listPlants.get(i).posy);
                    }
                    break;
                case 2:
                    for (int i = 0; i < Registre_Element.getInstance().listElements.size(); i++) {

                        out.println(Registre_Element.getInstance().listElements.get(i).name + ";" + Registre_Element.getInstance().listElements.get(i).posx + ";" + Registre_Element.getInstance().listElements.get(i).posy + ";" + Registre_Element.getInstance().listElements.get(i).reproduct + ";" + Registre_Element.getInstance().listElements.get(i).sleep + ";" + Map.getInstance().getMap().length + ";" + Map.getInstance().getMap()[0].length + ";" + MenuController.getLvlChoose() + ";" + Score.getNbMoves() + ";" + Registre_Element.getInstance().listPlants.get(i).posx + ";" + Registre_Element.getInstance().listPlants.get(i).posy + ";" + Registre_Element.getInstance().listElements.get(i).life);
                    }
                    break;
                case 3://MANQUE OBBSTACLE
                    for (int i = 0; i < Registre_Element.getInstance().listElements.size(); i++) {
                        out.println(Registre_Element.getInstance().listElements.get(i).name + ";" + Registre_Element.getInstance().listElements.get(i).posx + ";" + Registre_Element.getInstance().listElements.get(i).posy + ";" + Registre_Element.getInstance().listElements.get(i).reproduct + ";" + Registre_Element.getInstance().listElements.get(i).sleep + ";" + Map.getInstance().getMap().length + ";" + Map.getInstance().getMap()[0].length + ";" + MenuController.getLvlChoose() + ";" + Score.getNbMoves());
                    }
                    break;
                default:
                    break;
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        String nameFile = "./src/Ressources/Save.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(nameFile));
            String line = in.readLine();
            System.out.println(line);
            String Firstword[] = line.split(";");

            Map.getInstance().setMap(new int[Integer.parseInt(Firstword[5])][Integer.parseInt(Firstword[6])]);
            Score.setNbMoves(Integer.parseInt(Firstword[8]));
            MenuController.setLvlChoose(Integer.parseInt(Firstword[7]));

            if (Firstword[0].equals("Cat")) {
                Cat cat = new Cat(Integer.parseInt(Firstword[1]), Integer.parseInt(Firstword[2]), Integer.parseInt(Firstword[7]));
                cat.set_reproduct(Boolean.valueOf(Firstword[3]));
                cat.set_sleep(Boolean.valueOf(Firstword[4]));
                Registre_Element.getInstance().listElements.add(cat);
            } else if (Firstword[0].equals("Dog")) {
                Dog dog = new Dog(Integer.parseInt(Firstword[1]), Integer.parseInt(Firstword[2]), Integer.parseInt(Firstword[7]));
                dog.set_reproduct(Boolean.valueOf(Firstword[3]));
                dog.set_sleep(Boolean.valueOf(Firstword[4]));
                Registre_Element.getInstance().listElements.add(dog);
            } else if (Firstword[0].equals("Chicken")) {
                Chicken chicken = new Chicken(Integer.parseInt(Firstword[1]), Integer.parseInt(Firstword[2]), Integer.parseInt(Firstword[7]));
                chicken.set_reproduct(Boolean.valueOf(Firstword[3]));
                chicken.set_sleep(Boolean.valueOf(Firstword[4]));
                Registre_Element.getInstance().listElements.add(chicken);
            } else if (Firstword[0].equals("Cow")) {
                Cow cow = new Cow(Integer.parseInt(Firstword[1]), Integer.parseInt(Firstword[2]), Integer.parseInt(Firstword[7]));
                cow.set_reproduct(Boolean.valueOf(Firstword[3]));
                cow.set_sleep(Boolean.valueOf(Firstword[4]));
                Registre_Element.getInstance().listElements.add(cow);
            } else if (Firstword[0].equals("Wolf")) {
                Wolf wolf = new Wolf(Integer.parseInt(Firstword[1]), Integer.parseInt(Firstword[2]), Integer.parseInt(Firstword[7]));
                wolf.set_reproduct(Boolean.valueOf(Firstword[3]));
                wolf.set_sleep(Boolean.valueOf(Firstword[4]));
                Registre_Element.getInstance().listElements.add(wolf);
            }

            //Récupérer le niveau dès le début pour savoir quelles valeurs récupérer
            while ((line = in.readLine()) != null) {
                String word[] = line.split(";");
                //System.out.println("deuxième ligne: "+word[1]);
                for (int i = 0; i < word.length; i += 9) {
                    if (word[0].equals("Cat")) {
                        Cat cat = new Cat(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[7]));
                        cat.set_reproduct(Boolean.valueOf(word[3]));
                        cat.set_sleep(Boolean.valueOf(word[4]));
                        Registre_Element.getInstance().listElements.add(cat);
                    } else if (word[0].equals("Dog")) {
                        Dog dog = new Dog(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[7]));
                        dog.set_reproduct(Boolean.valueOf(word[3]));
                        dog.set_sleep(Boolean.valueOf(word[4]));
                        Registre_Element.getInstance().listElements.add(dog);
                    } else if (word[0].equals("Chicken")) {
                        Chicken chicken = new Chicken(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[7]));
                        chicken.set_reproduct(Boolean.valueOf(word[3]));
                        chicken.set_sleep(Boolean.valueOf(word[4]));
                        Registre_Element.getInstance().listElements.add(chicken);
                    } else if (word[0].equals("Cow")) {
                        Cow cow = new Cow(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[7]));
                        cow.set_reproduct(Boolean.valueOf(word[3]));
                        cow.set_sleep(Boolean.valueOf(word[4]));
                        Registre_Element.getInstance().listElements.add(cow);
                    } else if (word[0].equals("Wolf")) {
                        Wolf wolf = new Wolf(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[7]));
                        wolf.set_reproduct(Boolean.valueOf(word[3]));
                        wolf.set_sleep(Boolean.valueOf(word[4]));
                        Registre_Element.getInstance().listElements.add(wolf);
                    }

                }

            }

            //VERIFICATION
            for (int i = 0; i < Registre_Element.getInstance().listElements.size(); i++) {
                System.out.println("Numéro " + i + " " + Registre_Element.getInstance().listElements.get(i).name);

            };
            System.out.println("liste est de :" + Registre_Element.getInstance().listElements.size());
            System.out.println("");
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//            int i = 0;
//            while ((line = in.readLine()) != null) {
//                
//                String word[] = line.split(";");
//                System.out.println(word[i]);
//                //System.out.println("line: "+line);
//                i++;
//            }

    }

}
