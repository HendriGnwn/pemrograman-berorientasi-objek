/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuisPertemuan3;

/**
 * Quis Pertemuan 3
 * menyimpan negara dan masangan [4]
 * 
 * @author Hendri Gunawan | 41815120093
 */
public class CountryMain {
    public static void main(String[] args) {
        Country countries[] = {
            new Country("Indonesia", "Jakarta"),
            new Country("Pilipina", "Manila"),
            new Country("Austria", "Vienna"),
            new Country("India", "NewDelhi"),
            new Country("Iran", "Teheran")
        };
        
        for (Country country: countries) {
            if (country.getName().contains("I")) {
                System.out.println(country.getName());
            }
        }
    }
}

class Country {
    String name;
    String capitalCity;
    
    public Country(String name, String capitalCity) {
        this.name = name;
        this.capitalCity = capitalCity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCapitalCity() {
        return this.capitalCity;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }
}
