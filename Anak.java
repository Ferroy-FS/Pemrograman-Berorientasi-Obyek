/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan1;

/**
 *
 * @author LEGION
 */
public class Anak extends Bapak {
   
    protected int getJumlahIQ() {
        return jumlahIQ;
    }
    protected void setJumlahIQ(int jumlahIQ) {
        this.jumlahIQ = jumlahIQ;
    }

    private int jumlahIQ;
    
    int modelYear;
    String modelCar;
    
    public Anak(int year, String car){
        modelYear = year;
        modelCar = car;
    }
    
    public static void main(String[] args){
        Anak myBrand = new Anak(1970, "Chevrolet");
        System.out.println(myBrand.modelYear + " " + myBrand.modelCar);
    }
    
    /*public static void main(String[] args) {
        Anak gen2 = new Anak();
        gen2.setWarnaMata("hitam");
        gen2.setWarnaRambut("hitam");
        gen2.setTinggiBadan(146);
        gen2.setNama("Ficky");
        gen2.setUmur(15);
        gen2.setHobi("Membaca Komik");
        gen2.setKeahlian("bermain piano");
        gen2.setJumlahIQ(90);

        System.out.println("Warna mata anak(protected): " + gen2.getWarnaMata() + ".");
        System.out.println("Warna rambut anak(protected): " + gen2.getWarnaRambut() + ".");
        System.out.println("Tinggi badan anak(protected): " + gen2.getTinggiBadan() + "cm.");
        System.out.println("Nama anak ini adalah(protected): " + gen2.getNama() + ".");
        System.out.println("Umur anak ini(protected): " + gen2.getUmur() + " tahun.");
        System.out.println("Hobi anak ini adalah(protected): " + gen2.getHobi() + ".");
        System.out.println("Keahlian anak ini adalah(protected): " + gen2.getKeahlian() + ".");
        System.out.println("Jumlah IQ anak ini adalah(protected): " + gen2.getJumlahIQ() + ".");    
    }*/
}