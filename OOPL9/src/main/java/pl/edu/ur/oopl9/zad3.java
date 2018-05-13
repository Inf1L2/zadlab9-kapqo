/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.*;
/**
 *
 * @author Kowali
 */
public class zad3 {
    
    public static void zad3(){
        
        int n;
        Scanner in = new Scanner(System.in);
        List<samochody> cars = new ArrayList<samochody>();
        
        do{
        System.out.println("Wybierz działanie: 1 - Wyswietl liste samochodow, 2 - Dodaj samochod, 3 - Powrot do glownego menu");
        n = in.nextInt();
        
        switch(n){
            case 1:   
                carlist(cars);
                break;
            case 2:
                addCar(cars);
                break;
            case 3:
                Main.main(new String[0]);
                break;
            default:
                System.out.println("Nie ma takiego działania!");
                break;    
        }
        }
        while(n!=3);
        
        
        cars.add(new samochody("Mercedes","w123",2.4,140,20000));
        cars.add(new samochody("Volvo","s60",2.0,210,19000));
        cars.add(new samochody("Renault","Scenic",1.6,190,8000));
        cars.add(new samochody("Audi","a8",3.2,260,35000));
    }
    
        public static List<samochody> addCar(List<samochody> cars)
    {
        Scanner s = new Scanner(System.in);
        String marka;
        String nazwa;
        double poj_silnika;
        int max_predkosc;
        double cena;

        System.out.println("Dodaj samochod");
        System.out.print("Marka: ");
        marka = s.next();
        System.out.print("Nazwa: ");
        nazwa = s.next();
        System.out.print("Pojemnosc: ");
        poj_silnika = s.nextDouble();
        System.out.print("Predkosc maksymalna: ");
        max_predkosc = s.nextInt();
        System.out.print("Cena: ");
        cena = s.nextDouble();

        cars.add(new samochody(marka,nazwa,poj_silnika,max_predkosc,cena));
    return cars;
    }
    private static void carlist(List<samochody> cars)
    {
        Iterator carIt = cars.iterator();
        while (carIt.hasNext())
        {
        samochody car = (samochody)carIt.next();
            System.out.println(car.toString());
        }
    }
    
}
