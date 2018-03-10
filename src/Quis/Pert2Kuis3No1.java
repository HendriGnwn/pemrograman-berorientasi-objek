package Quis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 2
 * 10/03/2018
 * 
 * Kuis 3 No 1
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class Pert2Kuis3No1
{
    public static void main(String[] args) throws IOException
    {
        try {
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            double radius, panjang, volume;
            double phi = 3.14;
            
            System.out.println("Menghitung Radius dan Panjang suatu Silinder [Luas dan Volume]");

            System.out.print("Radius : ");
            radius = Double.parseDouble(dataIn.readLine());

            System.out.print("Panjang : ");
            panjang = Double.parseDouble(dataIn.readLine());

            volume = radius * radius * panjang * phi;
            System.out.println("Volume silinder tersebut adalah = " + volume);
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Salah Masukkan. " + e.getMessage());
        }
    }
}
