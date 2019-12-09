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
public class Heat extends EnergySource {

    private float maxTemperature;

    public Heat() {
        super("Heat");
        this.fuelUsed = "Wood";

    }

    public void setMaxTemperature(float v) {
        this.maxTemperature = v;
    }

    public float getMaxTemperature() {
        return this.maxTemperature;
    }

}
