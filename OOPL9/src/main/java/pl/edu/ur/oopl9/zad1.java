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
public class zad1 {
    
    public static void zad1(){
        int [] losowe;
        losowe = new int[100];
        Random rand = new Random();
        System.out.println("100 elementowa tablica z liczbami losowymi (0-100):");
        
        for(int i=0; i<losowe.length; i++){
         losowe[i] =rand.nextInt(100);   
         System.out.println(i + " element tablicy wynosi = " + losowe[i]);
        }
        
        Arrays.sort(losowe);
        
        System.out.println("Ta sama tablica, lecz posorotwana: ");
        
         for(int i=0; i<losowe.length; i++){
         System.out.println(i + " element tablicy wynosi = " + losowe[i]);
        }
    }
}
