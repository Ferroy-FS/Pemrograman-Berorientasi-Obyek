/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class Handphone extends Device {

    protected String getOS() {
        return OS;
    }
    protected void setOS(String OS) {
        this.OS = OS;
    }

    protected int getRamSize() {
        return ramSize;
    }
    protected void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    protected int getInternalstorageSize() {
        return internalstorageSize;
    }
    protected void setInternalstorageSize(int internalstorageSize) {
        this.internalstorageSize = internalstorageSize;
    }
    
    private String OS;
    private int ramSize;    
    private int internalstorageSize;

}