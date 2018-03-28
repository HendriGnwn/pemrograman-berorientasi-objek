/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan3;

import java.util.Arrays;
import java.util.Collections;

/**
 * Quis Pertemuan 3
 * Menampilkan larik bilangan dari belakang [2]
 * 
 * @author Hendri Gunawan | 41815120093
 */
public class LarikBilanganDariBelakang {
    public static void main(String[] args) {
        int bil[] = {8,9,4,7,6,1,5,3};
        
        System.out.print("larik bilangan dari depan: ");
        for (int i=0; i<bil.length; i++) {
            System.out.print(bil[i] + " ");
        }
        System.out.println();
        System.out.print("larik bilangan dari belakang: ");
        for (int i=bil.length-1; i>=0; i--) {
            System.out.print(bil[i] + " ");
        }
        System.out.println();
    }
    
}
