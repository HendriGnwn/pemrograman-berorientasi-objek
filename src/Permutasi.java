
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
public class Permutasi {
    public static void main(String[] args) {
        String[] nama = {
            "Budi",
            "Andin",
            "Permana"
        };
        int i,j,k;
        
        for(i=0;i<=2;i++)
            for(j=0;j<=2;j++)
                if(i!=j)
                    for(k=0;k<=2;k++)
                        if(i!=k && j != k)
                            System.out.println(nama[i] + '-' + nama[j] + '-' + nama[k]);
    }
}
