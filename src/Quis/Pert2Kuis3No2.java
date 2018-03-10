package Quis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pertemuan 2
 * 10/03/2018
 * 
 * Kuis 3 No 2
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class Pert2Kuis3No2
{
    public static void main(String[] args) throws IOException
    {
        try {
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            Double bil1, bil2, bil3;
            
            System.out.println("Mengurutkan dari 3 variable");

            System.out.print("Bil 1 : ");
            bil1 = Double.parseDouble(dataIn.readLine());

            System.out.print("Bil 2 : ");
            bil2 = Double.parseDouble(dataIn.readLine());
            
            System.out.print("Bil 3 : ");
            bil3 = Double.parseDouble(dataIn.readLine());

            List<Double> numbs = new ArrayList<Double>();
            numbs.add(bil1);
            numbs.add(bil2);
            numbs.add(bil3);
            Collections.sort(numbs);
            
            System.out.print("Hasilnya : ");
            for (Double result: numbs) {
                System.out.print(result.intValue() + " ");
            }
            
            System.out.println();
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Salah Masukkan. " + e.getMessage());
        }
    }
}
