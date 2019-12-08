/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author edvaldes
 */
public class Geometric_lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangulo R1 = new Rectangulo(11.54f, 19.31f);

        System.out.println("Los lados del rectangulo son: Longitud " + R1.getLongitud() + " Ancho " + R1.getAnchura());
        System.out.println("Su perímetro es: " + R1.getPerimetro());
        System.out.println("Su area es: " + R1.getArea());

    }

}
