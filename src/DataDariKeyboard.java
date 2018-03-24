
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
public class DataDariKeyboard {
    public static void main(String[] args) {
        double[] data = new double[10];
        int i, jumData;
        String str;
        char jawaban;
        
        Scanner scann = new Scanner(System.in);
        
        jumData = 0;
        for(i=0; i<data.length;i++) {
            System.out.print("Masukkan sembarang bilangan: ");
            data[i] = scann.nextDouble();
            scann.nextLine();
            
            //konfirmasi pemasukan
            if (i<data.length-2) {
                System.out.print("Masukkan lagi(Y/T) ?");
                str = scann.nextLine();
                jawaban = str.charAt(0);
                
                if (jawaban == 'T' || jawaban == 't') {
                    jumData = i+1;
                    break;
                }
            }
        }
        
        //tampilkan data
        for(i=1;i<jumData;i++) {
            System.out.println(data[i]);
        }
        
    }
}
