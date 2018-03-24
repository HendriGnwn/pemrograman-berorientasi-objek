
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
public class Kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        tahun = scanner.nextInt();
        if (tahun % 4 != 0) {
            System.out.println("Bukan kabisat");
        } else {
            if ((tahun % 100 == 0) && (tahun % 400 == 0)) {
                System.out.println("Kabisat");
            } else {
                System.out.println("Bukan Kabisat");
            }
        }
    }
}
