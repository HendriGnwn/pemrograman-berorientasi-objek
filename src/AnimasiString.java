
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 3
 * 
 * 24/03/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class AnimasiString {
    public static void main(String[] args) {
        String kata;
        int i,j, panjang;
        char karakter;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sembarang kata:");
        kata = scan.nextLine();
        
        panjang = kata.length();
        for(i=0;i<panjang;i++) {
            for(j=0;j<=i;j++) {
                karakter = kata.charAt(j);
                System.out.print(karakter);
            }
            System.out.println();
        }
    }
}
