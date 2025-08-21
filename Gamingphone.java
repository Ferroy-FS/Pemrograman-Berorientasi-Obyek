/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class Gamingphone extends Handphone {

    protected String getChipset() {
        return Chipset;
    }
    protected void setChipset(String Chipset) {
        this.Chipset = Chipset;
    }

    protected String getCoolingSystem() {
        return coolingSystem;
    }
    protected void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    private String coolingSystem;
    private String Chipset;
    
    public static void main(String[] args) {
        Gamingphone gmng = new Gamingphone();
        gmng.setBrand("Asus");
        gmng.setModel("ROG Phone 9 Pro");
        gmng.setOS("Android");
        gmng.setRamSize(16);
        gmng.setInternalstorageSize(512);
        gmng.setCoolingSystem("Liquid Cooling");
        gmng.setChipset("Snapdragon 8 Elite Mobile Platform");
        
        System.out.println("Brand: " + gmng.getBrand());
        System.out.println("Model: " + gmng.getModel());
        System.out.println("OS: " + gmng.getOS());
        System.out.println("Ram size: " + gmng.getRamSize() + "GB");
        System.out.println("Internal storage size: " + gmng.getInternalstorageSize() + "GB");
        System.out.println("Cooling system: " + gmng.getCoolingSystem());
        System.out.println("Chipset: " +  gmng.getChipset());
    }
}