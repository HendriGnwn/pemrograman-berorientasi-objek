/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan4;

/**
 * quis uji persegi panjang
 * 
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class UjiPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(3.5, 35.9);
        
        System.out.println("Sebuah persegi panjang pertama dengan : " + persegiPanjang1.keString());
        System.out.println("Luas sebesar : " + persegiPanjang1.dapatLuas());
        System.out.println("Keliling sebesar : " + persegiPanjang1.dapatKeliling());
        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(4, 40);
        System.out.println("Sebuah persegi panjang kedua dengan : " + persegiPanjang2.keString());
        System.out.println("Luas sebesar : " + persegiPanjang2.dapatLuas());
        System.out.println("Keliling sebesar : " + persegiPanjang2.dapatKeliling());
        
    }
}
