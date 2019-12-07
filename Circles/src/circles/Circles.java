/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

/**
 *
 * @author edvaldes
 */
public class Circles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //pequeña corrección a lo que se mostraba en el ejercicio
        int ia[] = {1, 3, 5, 7, 9};

        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8) {
                    continue;
                }
                System.out.print(" " + x);
                if (j == 1) {
                    break;
                }
                continue;
            }
            continue;
        }

        //el resultado es 113399
    }

}
