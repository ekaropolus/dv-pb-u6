/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutilities;

import java.util.Scanner;

/**
 *
 * @author edvaldes
 */
public class ArrayUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.println("De cuantos elementos va a ser el arreglo");
        int n = s.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {//for reading array
            System.out.println("Digite el elemento " + i + ": ");
            A[i] = s.nextInt();

        }

        // Function calling
        System.out.println("El elemento más pequeño es: ");
        System.out.println(ArrayAnalaizer.findMinRec(A, n));

        ArrayAnalaizer.quickSort(A, 0, n - 1);

        System.out.println("Arreglo después de quicksort: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }

}
