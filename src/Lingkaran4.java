
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 4
 * 10/31/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class Lingkaran4 extends ObjekGeometri1 {
    private double radius;
    
    public Lingkaran4() {
    }
    
    public Lingkaran4(double  radius) {
        this.radius = radius;
    }
    
    public Lingkaran4(double radius, String warna, boolean terisi) {
        this.radius = radius;
        this.dapatWarna(warna);
        this.tetapkanTerisi(terisi);
    }
    
    //mengembalikan radius
    public double dapatRadius() {
        return radius;
    }
    
    //menetapkan radius baru
    public void tetapkanRadius(double radius) {
        this.radius = radius;
    }
    
    //mengembalikan luas
    
}
