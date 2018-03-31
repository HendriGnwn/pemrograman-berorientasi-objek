/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FASILKOM
 */
public class UjiLingkaranPersegiPanjang {
    public static void main(String[] args) {
        Lingkaran4 lingkaran = new Lingkaran4(14);
        System.out.println("Lingkaran : " + lingkaran.keString());
        System.out.println("Diameter sebesar : " + lingkaran.dapatDiameter());
        System.out.println("Luas sebesar : " + lingkaran.dapatLuas());
        System.out.println("Keliling sebesar : " + lingkaran.dapatKeliling());
    }
}