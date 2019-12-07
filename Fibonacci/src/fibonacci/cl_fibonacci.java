/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author edvaldes
 */
public class cl_fibonacci {

    private int n;

    public cl_fibonacci(int m) {

        this.n = m;

    }

    public void setN(int m) {
        this.n = m;
    }

    public int getFibonacciLoop() {

        int n_ant = 0;
        int n_ant_ant = 0;
        int f_n = 0;

        switch (this.n) {

            case 0:
                return 0;
            case 1:
                return 1;
            default:
                n_ant = 0;
                n_ant_ant = 1;
                for (int i = 1; i <= this.n; i++) {
                    f_n = n_ant + n_ant_ant;
                    n_ant_ant = n_ant;
                    n_ant = f_n;
                }
                return f_n;
        }

    }
}
