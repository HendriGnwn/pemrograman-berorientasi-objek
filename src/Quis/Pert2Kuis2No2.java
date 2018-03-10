package Quis;

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
 * Kuis 2 No 2
 *
 * @author Hendri Gunawan - 41815120093
 */
public class Pert2Kuis2No2 {
    public static void main(String[] args) {
        
        String jam1String = JOptionPane.showInputDialog("Jam 1: ");
        Integer jam1 = Integer.parseInt(jam1String);
        
        String menit1String = JOptionPane.showInputDialog("Menit 1: ");
        Integer menit1 = Integer.parseInt(menit1String);
        
        String jam2String = JOptionPane.showInputDialog("Jam 2: ");
        Integer jam2 = Integer.parseInt(jam2String);
        
        String menit2String = JOptionPane.showInputDialog("Menit 2: ");
        Integer menit2 = Integer.parseInt(menit2String);
        
        Integer selisih = ((jam2 * 60) + menit2) - ((jam1 * 60) + menit1);
        
        System.out.println("Selisih kedua jam tersebut adalah " + selisih + " menit");
    }
}
