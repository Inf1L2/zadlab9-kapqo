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
        
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");
        n = in.nextInt();
        switch(n)
        {
            case 1: 
                zad1.zad1();
                break;
            case 2: 
                zad2.zad2();
                break;
            case 3: 
                zad3.zad3();
                break;
            case 4: 
                zad1.zad1();
                break;
            default: 
                System.out.println("Nie ma takiego numeru zadania!");
                break;
        }
        
    }
    
}
