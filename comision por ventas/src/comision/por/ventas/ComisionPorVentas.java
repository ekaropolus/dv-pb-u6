/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision.por.ventas;

import java.util.Random;

/**
 *
 * @author edvaldes
 */
public class ComisionPorVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variable para generar aleatoriamente los rangos de venta
        Random rango = new Random();
        // vamos a tener 9 rangos de venta
        int rangosVenta[] = new int[9];

        //simulamos las frecuencia de los rangos de ventas suponiendo que
        //hubo 30 vendedores en la compañia
        for (int venta = 1; venta <= 30; venta++) {
            ++rangosVenta[rango.nextInt(9)];
        }

        //cabecera de la tabla
        System.out.println("rango\tFrecuencia");

        //Impresion de la tabla de rangos y frecuencia
        for (int i = 0; i < rangosVenta.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("rango $200-$299" + "\t" + rangosVenta[i]);
                    break;
                case 1:
                    System.out.println("rango $300-$399" + "\t" + rangosVenta[i]);
                    break;
                case 2:
                    System.out.println("rango $400-$499" + "\t" + rangosVenta[i]);
                    break;
                case 3:
                    System.out.println("rango $500-$599" + "\t" + rangosVenta[i]);
                    break;
                case 4:
                    System.out.println("rango $600-$699" + "\t" + rangosVenta[i]);
                    break;
                case 5:
                    System.out.println("rango $700-$799" + "\t" + rangosVenta[i]);
                    break;
                case 6:
                    System.out.println("rango $800-$899" + "\t" + rangosVenta[i]);
                    break;
                case 7:
                    System.out.println("rango $900-$999" + "\t" + rangosVenta[i]);
                    break;
                case 8:
                    System.out.println("rango $1000-..." + "\t" + rangosVenta[i]);
                    break;

            }

        }

    }

}
