/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordutilities;

import java.util.Scanner;

/**
 *
 * @author edvaldes
 */
public class WordUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Obtenemos el nombre del empleado
        System.out.println("\nBuenas tardes, digita una palabra y te dire si es palindroma");
        String str = input.nextLine();

        str = str.replace(" ", "");
        str = str.replace(".", "");
        str = str.replace(",", "");
        str = str.replace(":", "");
        str = str.replace(";", "");
        str = str.replace("-", "");

        int n = str.length();

        System.out.println(str);

        if (WordAnalaizer.testPalindrom(str, 0, n - 1)) {
            System.out.println("Si es palindroma");
        } else {
            System.out.println("No es palindroma");
        }

    }

}
