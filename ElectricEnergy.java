/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class ElectricEnergy extends EnergySource {

   
    protected int getVoltage() {
        return Voltage;
    }
    protected void setVoltage(int Voltage) {
        this.Voltage = Voltage;
    }

    protected String getProvider() {
        return Provider;
    }
    protected void setProvider(String Provider) {
        this.Provider = Provider;
    }
    
    private int Voltage;
    private String Provider;
    
}