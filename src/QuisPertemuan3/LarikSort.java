/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quis Pertemuan 3
 * menampilkan larik bilangan dan nama dari terkecil dan terbesar [3]
 * 
 * @author Hendri Gunawan | 41815120093
 */
public class LarikSort {
    public static void main(String[] args) {
        Names[] names = {
            new Names(10, "Rian"),
            new Names(6, "Sita"),
            new Names(3, "Fanny"),
            new Names(1, "Erwin"),
            new Names(2, "Ahmad"),
            new Names(4, "Ridwan")
        };
        
        System.out.println("---------------------");
        System.out.println("Nomor\tNama");
        System.out.println("---------------------");
        for (Names name: names) {
            System.out.println(name.getId() + "\t" + name.getName());
        }
        System.out.println("---------------------");
        
        Arrays.sort(names, new Comparator<Names>() {
            @Override
            public int compare(Names o1, Names o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        System.out.println();
        System.out.println("Diurutkan sesuai Nomor:");
        System.out.println("---------------------");
        System.out.println("Nomor\tNama");
        System.out.println("---------------------");
        for (Names name: names) {
            System.out.println(name.getId() + "\t" + name.getName());
        }
        System.out.println("---------------------");
    }
}

class Names implements Comparable<Names> {
    int id;
    String name;
    
    public Names(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(int value) {
        this.id = value;
    }
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String value) {
        this.name = value;
    }
    
    @Override
    public int compareTo(Names o) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain
        return this.getId().compareTo(o.getId());
    }
}
