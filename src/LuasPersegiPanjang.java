
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
public class LuasPersegiPanjang 
{
    public static void main(String[] args) {
        double panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Panjang : ");
        panjang = scan.nextDouble();
        
        System.out.print("Lebar : ");
        lebar = scan.nextDouble();
        
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }
}
