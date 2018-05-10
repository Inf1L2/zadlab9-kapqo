/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.*;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] losowe;
        losowe = new int[100];
        Random rand = new Random();
        
        
        for(int i=0; i<losowe.length; i++){
         losowe[i] =rand.nextInt(100);   
         System.out.println(i + " -ty element tablicy wynosi = " + losowe[i]);
        }
        
        Arrays.sort(losowe);
        
        System.out.println("Ta sama tablica, lecz posorotwana: ");
        
         for(int i=0; i<losowe.length; i++){
         System.out.println(i + " -ty element tablicy wynosi = " + losowe[i]);
        }
        
    }
    
}
