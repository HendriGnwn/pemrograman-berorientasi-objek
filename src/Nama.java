
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
 * @author Hendri Gunawan - 41815120093
 */
public class Nama {
    public static void main (String[] args) {
        String nama;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Siapa namamu : ");
        nama = scan.nextLine();
        
        System.out.println("Hai, namamu " + nama);
    }
}
