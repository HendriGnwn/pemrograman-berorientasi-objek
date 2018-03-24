
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 3
 * menggunakan switch case
 * 
 * 24/03/2018
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class Bulan {
    public static void main(String[] args) {
        int kodeBulan;
        String namaBulan = null;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kode bulan [1-12] : ");
        kodeBulan = scanner.nextInt();
        
        switch(kodeBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "salah masukkan kode bulan";
        }
        
        System.out.println("Nama bulan nya adalah " + namaBulan);
    }
}
