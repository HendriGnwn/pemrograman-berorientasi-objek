/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan3;

import java.util.Scanner;

/**
 * Quis Pertemuan 3
 * Menampilkan deret bilangan [1]
 * 
 * @author Hendri Gunawan | 41815120093
 */
public class DeretBilangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan bulat untuk menghasilkan deret bilangan : ");
        int batas = scan.nextInt();
        int i, j;
        for (i=1, j=1; i<batas; i=i+j++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
