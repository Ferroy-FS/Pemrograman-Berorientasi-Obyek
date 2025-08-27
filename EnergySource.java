/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class EnergySource {

    protected String getName() {
        return Name;
    }
    protected void setName(String Name) {
        this.Name = Name;
    }

    protected String getRenewable() {
        return Renewable;
    }
    protected void setRenewable(String Renewable) {
        this.Renewable = Renewable;
    }
    
    private String Name;
    private String Renewable;
    
}