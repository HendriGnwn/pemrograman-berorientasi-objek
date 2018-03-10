
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class LuasPersegiPanjangBuffered
{
    public static void main(String[] args) throws IOException
    {
        try {
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            double panjang, lebar, luas;
            
            System.out.println("Menghitung Luas Persegi Panjang");

            System.out.print("Panjang : ");
            panjang = Double.parseDouble(dataIn.readLine());

            System.out.print("Lebar : ");
            lebar = Double.parseDouble(dataIn.readLine());

            luas = panjang * lebar;
            System.out.println("Luas = " + luas);
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Salah Masukkan. " + e.getMessage());
        }
    }
}
