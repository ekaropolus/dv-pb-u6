/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bird;

/**
 *
 * @author edvaldes
 */
public class Raptor extends Bird {

    static {
        System.out.print("r1 ");
    }

    public Raptor() {
        System.out.print("r2 ");
    }

    {
        System.out.print("r3 ");
    }

    static {
        System.out.print("r4 ");
    }

}
