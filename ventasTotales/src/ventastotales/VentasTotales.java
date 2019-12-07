/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventastotales;

import java.util.Random;

/**
 *
 * @author edvaldes
 */
public class VentasTotales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] reporte = new int[6][5];
        Random random = new Random();
        String to_line;

        //System.out.println("Producto" + "\t" + "Empleado 1" + "\t" + "Empleado 2" + "\t" + "Producto 3" + "\t" + "Producto 4");
        for (int i = 0; i < 5; i++) {
            reporte[i][4] = 0;
            for (int j = 0; j < 4; j++) {
                //reporte[5][j] = 0;
                reporte[i][j] = random.nextInt(3);
                reporte[i][4] = reporte[i][4] + reporte[i][j];
                reporte[5][j] = reporte[5][j] + reporte[i][j];
            }
        }

        to_line = "Vendedores\tA\tB\tC\tD\n";
        System.out.println(to_line);
        for (int i = 0; i < 6; i++) {
            if (i != 5) {
                to_line = "Producto: " + (i + 1) + "\t";
            } else {
                to_line = "Totales: " + "\t";
            }
            for (int j = 0; j < 5; j++) {
                to_line = to_line + reporte[i][j] + "\t";
            }
            System.out.println(to_line);
            System.out.println("\n");
        }
    }
}
