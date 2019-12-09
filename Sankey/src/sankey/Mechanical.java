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
public class Mechanical extends EnergySource {

    private float maxRevolutionPerMinute;
    private float powerOutput;

    public Mechanical() {
        super("Heat");
        this.fuelUsed = "Strong";

    }

    public void setmaxRevolutionPerMinute(float v) {
        this.maxRevolutionPerMinute = v;
    }

    public float getmaxRevolutionPerMinute() {
        return this.maxRevolutionPerMinute;
    }

    public void setPowerOutput(float v) {
        this.powerOutput = v;
    }

    public float getPowerOutput() {
        return this.powerOutput;
    }

}
