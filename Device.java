/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class Device {

    protected String getBrand() {
        return Brand;
    }
    protected void setBrand(String Brand) {
        this.Brand = Brand;
    }

    protected String getModel() {
        return Model;
    }
    protected void setModel(String Model) {
        this.Model = Model;
    }
    
    private String Brand;
    private String Model;
    
    public void Performance(){
        System.out.println("FPS: 60");
    }
}
