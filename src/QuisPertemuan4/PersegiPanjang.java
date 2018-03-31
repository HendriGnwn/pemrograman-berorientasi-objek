/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan4;

/**
 * Quis pertemuan 4
 * merepresentasikan persegi panjang
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class PersegiPanjang {
    double lebar;
    double tinggi;
    
    public PersegiPanjang() {
    }
    
    public PersegiPanjang(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double dapatLuas() {
        return lebar * tinggi;
    }
    
    public double dapatKeliling() {
        return 2 * (lebar + tinggi);
    }
    
    public String keString() {
        return "Lebar : " + lebar + " dan tinggi : " + tinggi; 
    }
}
