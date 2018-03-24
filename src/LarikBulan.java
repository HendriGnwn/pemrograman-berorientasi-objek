
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 3
 * 24/03/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class LarikBulan {
    public static void main(String[] args) {
        String[] namaBulan = {
            "",
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"
        };
        
        int kodeBulan;
        
        System.out.print("Masukkan kode bulan [1-12]: ");
        Scanner scan = new Scanner(System.in);
        kodeBulan = scan.nextInt();
        
        if (kodeBulan >= 1 && kodeBulan <= 12) {
            System.out.println("Bulan: " + namaBulan[kodeBulan]);
        } else {
            System.out.println("Kode bulan harus antara 1 sampai 12");
        }
    }
}
