
import java.util.Date;

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
public class ObjekGeometri1 {
    private String warna = "putih";
    private boolean terisi;
    private Date tanggalDiciptakan;
    
    //menciptakan suatu objek geometri default
    public ObjekGeometri1() {
        tanggalDiciptakan = new Date();
    }
    
    //menciptakan suatu objek geometri dengan warna dan nilai terisi
    public ObjekGeometri1(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }
    
    //metode untuk mengembalikan warna
    public String dapatWarna() {
        return warna;
    }
    
    //menetapkan suatu warna baru
    public void dapatWarna(String warna) {
        this.warna = warna;
    }
    
    //mengembalikan terisi, kerana terisi adalah suatu boolean, metode dapat dinamakan 
    public boolean apaTerisi() {
        return terisi;
    }
    
    //menetapkan suatu nilai terisi yang baru
    public void tetapkanTerisi(boolean terisi) {
        this.terisi = terisi;
    }
    
    public Date dapatTanggalDiciptakan() {
        return tanggalDiciptakan;
    }
    
    //mengembalikan suatu representasi string atas objek ini
    public String keString() {
        return "Diciptakan pada " + tanggalDiciptakan + "\n warna : " + warna + " dan nilai -tersi " + terisi;
    }
}
