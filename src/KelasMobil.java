
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 4
 * 31/03/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
class Mobil {
    // variable instan
    String warna;
    String merk = "merci";
    int tahunProduksi;
    double hargaBeli;
    
    // metode pada kelas, void menyatakan metode tidak mempunyai nilai balik
    // this menyatakan objek dari kelas saat
    void isiData(String warnaMobil, int tahunProduksiMobil, double hargaBeliMobilSekarang) {
        this.warna = warnaMobil;
        this.tahunProduksi = tahunProduksiMobil;
        this.hargaBeli = hargaBeliMobilSekarang;
    }
    
    // metode ambilWarna() digunakan untuk memperoleh isi variable instan warna
    // return menyebabkan eksekusi terhadap metode segera diakhiri
    String ambilWarna() {
        return warna;
    }
    
    // metode ambiLTahunProduksi() digunakan untuk memperoleh isi variable instan tahun produksi
    int ambilTahunProduksi() {
        return tahunProduksi;
    }
    
    //akses private khusus berlaku di kelas itu sendiri
    private double nilaiMobil() {
        return 300;
    }
    
    public double hargaJualMobil() {
        return 2 * nilaiMobil() * hargaBeli;
    }
}

public class KelasMobil {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        //mengisi variable instan
        mobilku.isiData("merah", 2003, 500);
        
        //menampilkan isi variable instan via variable dan metode
        System.out.println("Warna : " + mobilku.ambilWarna());
        System.out.println("Merk Mobil : " + mobilku.merk);
        System.out.println("Tahun Produksi : " + mobilku.ambilTahunProduksi());
        System.out.println("Harga jual saat ini : " + mobilku.hargaJualMobil());
        
        // System.out.println("nilai beli :" + mobilku.nilaiMobil());
    }
}
