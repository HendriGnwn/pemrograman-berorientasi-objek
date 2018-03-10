package Quis;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 2
 * 10/03/2018
 * 
 * Kuis 2 No 1
 *
 * @author Hendri Gunawan - 41815120093
 */
public class Pert2Kuis2No1 {
    public static void main(String[] args) {
        int bilangan1, bilangan2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menampilkan 2 buah bilangan bulat [Kuis 2 No 1]");
        
        System.out.print("Bilangan 1 : ");
        bilangan1 = scan.nextInt();
        
        System.out.print("Bilangan 2 : ");
        bilangan2 = scan.nextInt();
        
        System.out.println("Jumlah Bilangan 1 dan Bilangan 2 = " + (bilangan1 + bilangan2));
    }
}
