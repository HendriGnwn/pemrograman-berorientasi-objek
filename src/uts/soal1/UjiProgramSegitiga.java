package uts.soal1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FASILKOM
 */
public class UjiProgramSegitiga {
    public static void main(String[] args) {
        SegiTiga segitiga = new SegiTiga(1, 1.2, 1.5, "kuning", true);
        
        System.out.println(segitiga.keString());
        System.out.println("Warna : " + segitiga.dapatWarna());
        System.out.println("Terisi : " + segitiga.apaTerisi());
        System.out.println("Luas sebesar : " + segitiga.dapatLuas());
        System.out.println("Keliling sebesar : " + segitiga.dapatKeliling());
    }
}
