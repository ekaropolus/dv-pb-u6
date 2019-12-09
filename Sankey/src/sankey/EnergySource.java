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
public class EnergySource {

    protected float Cost = 0;
    protected String fuelUsed;
    protected String name;

    public EnergySource(String en) {
        this.setName(en);

    }

    public String getName() {
        return this.name;
    }

    public float getCost() {
        return this.Cost;
    }

    public void setName(String eN) {
        this.name = eN;
    }

    public void setCost(float cs) {
        this.Cost = cs;
    }

}
