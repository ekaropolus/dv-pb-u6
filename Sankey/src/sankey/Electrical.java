/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sankey;

/**
 *
 * @author edvaldes
 */
public class Electrical extends EnergySource {

    private float volts;

    public Electrical() {
        super("Electrical");
        this.fuelUsed = "Gravity";

    }

    public void setVolts(float v) {
        this.volts = v;
    }

    public float getVolts() {
        return this.volts;
    }

}
