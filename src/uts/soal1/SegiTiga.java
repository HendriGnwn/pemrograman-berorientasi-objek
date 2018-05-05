package uts.soal1;

/**
 *
 * @author Hendri Gunawan - 41815120093
 */
public class SegiTiga extends ObjekGeometri {
    double sisi1 = 1;
    double sisi2 = 1;
    double sisi3 = 1;
    
    public SegiTiga() {
    }
    
    public SegiTiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    public SegiTiga(double sisi1, double sisi2, double sisi3, String warna, boolean terisi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.dapatWarna(warna);
        this.tetapkanTerisi(terisi);
    }
    
    public void setSisi1(double value) {
        this.sisi1 = value;
    }
    
    public double getSisi1() {
        return this.sisi1;
    }
    
    public void setSisi2(double value) {
        this.sisi2 = value;
    }
    
    public double getSisi2() {
        return this.sisi2;
    }
    
    public void setSisi3(double value) {
        this.sisi3 = value;
    }
    
    public double getSisi3() {
        return this.sisi3;
    }
    
    public double dapatLuas() {
        double tinggi;
        tinggi = Math.pow(this.sisi2, 2) + Math.pow(this.sisi3, 2);
        tinggi = Math.sqrt(tinggi);
        return 0.5 * this.sisi1 * (tinggi);
    }
    
    public double dapatKeliling() {
        return this.sisi1 + this.sisi2 + this.sisi3;
    }
    
    public String keString() {
        return "Segitiga : sisi1 = " + this.sisi1 + " sisi2 = " + this.sisi2 + " sisi3 = " + this.sisi3;
    }
}
