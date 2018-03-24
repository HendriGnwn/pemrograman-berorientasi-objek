
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 3
 * looping while
 * 24/03/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class Segitiga {
    public static void main(String[] args) {
        int i, j, tinggi;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = scan.nextInt();
        
        for (i=1; i<=tinggi; i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
