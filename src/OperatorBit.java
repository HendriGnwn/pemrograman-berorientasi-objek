/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hendri Gunawan - 41815120093
 */
public class OperatorBit {
    public static void main (String args []) {
        System.out.println("9 & 10 = " + (9 & 10));
        System.out.println("29 & 7 = " + (29 & 7));
        System.out.println("9 | 10 = " + (9 | 10));
        System.out.println("27 | 7 = " + (27 | 7));
        System.out.println("~185 = " + (~185));
        System.out.println("-29 & 7 = " + (-29 & 7));
        System.out.println("29 << 1 = " + (29 << 1));
        System.out.println("-29 >> 1 = " + (-29 >> 1));
        System.out.println("29 & 1 = " + (29 & 1));
        System.out.println("-29 >>> 1 = " + (-29 >>> 1));
    }
}