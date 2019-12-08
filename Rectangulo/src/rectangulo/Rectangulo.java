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
public class Rectangulo {

    private float longitud;
    private float anchura;

    public Rectangulo(float a, float b) {

        this.setLongitud(a);
        this.setAnchura(b);
    }

    public float getLongitud() {
        return this.longitud;
    }

    public float getAnchura() {
        return this.anchura;
    }

    public void setLongitud(float a) {
        if (a > 0.0 && a < 20.0) {
            this.longitud = a;
        } else {
            this.longitud = 1;
        }
    }

    public void setAnchura(float b) {
        if (b > 0.0 && b < 20.0) {
            this.anchura = b;
        } else {
            this.longitud = 1;
        }
    }

    public float getPerimetro() {

        return (2 * this.anchura) + (2 * this.longitud);
    }

    public float getArea() {

        return this.anchura * this.longitud;
    }
}
