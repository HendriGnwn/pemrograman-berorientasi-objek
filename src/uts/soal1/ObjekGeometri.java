package uts.soal1;


import java.util.Date;

/**
 *
 * @author Hendri Gunawan - 41815120093
 */
public class ObjekGeometri {
    private String warna = "kuning";
    private boolean terisi = true;
    private Date tanggalDiciptakan;
    
    //menciptakan suatu objek geometri default
    public ObjekGeometri() {
        tanggalDiciptakan = new Date();
    }
    
    //menciptakan suatu objek geometri dengan warna dan nilai terisi
    public ObjekGeometri(String warna, boolean terisi) {
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
        return "Diciptakan pada " + tanggalDiciptakan + "\nwarna " + warna + " dan nilai tersi " + terisi;
    }
}
