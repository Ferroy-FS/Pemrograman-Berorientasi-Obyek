/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class SolarEnergy extends ElectricEnergy {

    protected int getPanelCount() {
        return panelCount;
    }
    protected void setPanelCount(int panelCount) {
        this.panelCount = panelCount;
    }

    protected double getEfficiency() {
        return efficiency;
    }
    protected void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
    
    private int panelCount;
    private double efficiency;
    
    public static void main(String[] args) {
        SolarEnergy slr = new SolarEnergy();
        slr.setName("Solar Power");
        slr.setRenewable("Yes");
        slr.setVoltage(440);
        slr.setProvider("U-Solar Indonesia");
        slr.setPanelCount(100);
        slr.setEfficiency(92.4);
        
        System.out.println("Energy Source: " + slr.getName());
        System.out.println("Renewable: " + slr.getRenewable());
        System.out.println("Voltage: " + slr.getVoltage() + "V");
        System.out.println("Provider: " + slr.getProvider());
        System.out.println("Solar Panels: " + slr.getPanelCount());
        System.out.println("Efficiency: " + slr.getEfficiency() + "%");
    }
}