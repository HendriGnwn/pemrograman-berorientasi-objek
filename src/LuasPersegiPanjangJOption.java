
import javax.swing.JOptionPane;

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
public class LuasPersegiPanjangJOption
{
    public static void main(String[] args) {
        double luas;
        String panjangString = JOptionPane.showInputDialog("Masukkan Panjang ");
        // konversi string double
        Double panjang = Double.parseDouble(panjangString);
        
        String lebarString = JOptionPane.showInputDialog("Masukkan Lebar ");
        // konversi string double
        Double lebar = Double.parseDouble(lebarString);
        
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }
}
