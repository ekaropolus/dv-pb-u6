/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightreservation;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author edvaldes
 */
public class FlightReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inicio la clase auxiliar para obtener entrada de pantalla
        Scanner input = new Scanner(System.in);

        //arreglo para los asientos
        boolean asientos[] = new boolean[10];

        //lo inicializamos a false
        for (boolean x : asientos) {
            x = false;
        }

        //declaro la solución que deberá hacer el usuario
        int seleccion = 1;
        char aceptacion = 'Y';

        //Loop para pantalla de selección
        while (seleccion != 0) {
            System.out.println("Introduzca el tipo de siento:");
            System.out.println("2 es clase económica y 1 es primera clase");
            System.out.println("( presione 0 para salir )");
            seleccion = input.nextInt(); //numero del producto
            if (seleccion == 0) {
                break;
            }

            //esta es la parte principal. Utilizamos una variable para saber si
            //el asiento fue asignado on o con éxito.
            boolean asignedSeat = false;
            int asignedSeatNumber = 0;
            for (int i = 0; i < asientos.length; i++) {

                if (seleccion == 1 && asientos[i] == false && i < 5) {
                    asientos[i] = true;
                    asignedSeat = true;
                    asignedSeatNumber = i + 1;
                    break;
                }

                if (seleccion == 1 && i == 4 && asignedSeat == false) {
                    System.out.println("Primera clase completa. ¿Desea buscar en clase económica?");
                    System.out.println("Ponga Y para aceptar");
                    aceptacion = input.next().charAt(0);

                    if (aceptacion == 'Y') {
                        seleccion = 2;
                        continue;
                    } else {
                        break;
                    }
                }

                if (seleccion == 2 && asientos[i] == false && i >= 5) {
                    asientos[i] = true;
                    asignedSeat = true;
                    asignedSeatNumber = i + 1;
                    break;
                }

                if (seleccion == 2 && i == 9 && asignedSeat == false) {
                    System.out.println("Clase económica completa. ¿Desea buscar en primera clase?");
                    System.out.println("Ponga Y para aceptar");
                    aceptacion = input.next().charAt(0);

                    if (aceptacion == 'Y') {
                        seleccion = 1;
                        i = 0;
                        continue;
                    } else {
                        break;
                    }
                }

            }

            if (asignedSeat == true) {
                System.out.println("Asiento asignado: " + asignedSeatNumber);
                if (seleccion == 1) {
                    System.out.println("Primera Clase");
                } else {
                    System.out.println("Clase económica");
                }

            }

        }

    }

}
