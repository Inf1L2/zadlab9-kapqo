/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author Kowali
 */
public class samochody {
    
    private String marka;
    private String nazwa;
    private double poj_silnika;
    private int max_predkosc;
    private double cena;

    public samochody(String marka, String nazwa, double poj_silnika, int max_predkosc, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.poj_silnika = poj_silnika;
        this.max_predkosc = max_predkosc;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPoj_silnika() {
        return poj_silnika;
    }

    public int getMax_predkosc() {
        return max_predkosc;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPoj_silnika(double poj_silnika) {
        this.poj_silnika = poj_silnika;
    }

    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod(" + "Marka: " + marka + ",Nazwa: " + nazwa + ",Pojemnosc silnika: " + poj_silnika + ",Predkosc maksymalna: " + max_predkosc + ",Cena: " + cena + ")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
