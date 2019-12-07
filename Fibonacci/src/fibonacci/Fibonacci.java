/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edvaldes
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Obtenemos el nombre del empleado
        System.out.println("\nBuenas tardes, ¿Qué elemento de la serie Fibonacci desea que calcule?");
        int n = input.nextInt();

        cl_fibonacci F_n = new cl_fibonacci(n);

        int result = F_n.getFibonacciLoop();

        System.out.println("El numero " + n + " de la serie Fibonacci es: " + result);
    }

}
