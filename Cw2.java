/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Cw2 {
    
    public class Person {
        
        String Imie, Nazwisko;
        int Telefon;
        
        public void ustaw(String imie, String nazwisko, int telefon) {
            
            this.Imie=imie;
            this.Nazwisko=nazwisko;
            this.Telefon=telefon;
           
        }
        
        public void wysw() {
            System.out.println(Imie);
            System.out.println(Nazwisko);
            System.out.println(Telefon);
        }
            
        
    }
    
    public void ksiazka() {
        List<Person> ksiazka = new ArrayList<Person>();
        Scanner sc = new Scanner (System.in);
        Person p = new Person();
        String im, nazw;
        int tel;
        
        System.out.println("podaj dane do książki");
        System.out.println("Imie:");
        im = sc.nextLine();
        
        System.out.println("Nazwisko:");
        nazw = sc.nextLine();
        
        System.out.println("Telefon:");
        tel = Integer.parseInt(sc.nextLine());
        
        p.ustaw(im, nazw, tel);
        ksiazka.add(p);
        System.out.println(ksiazka);
        
        for (int i=0; i<ksiazka.size(); i++) {
            
            ksiazka.get(i).wysw();
        
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cw2 ks = new Cw2();
        ks.ksiazka();
        
        
    }
    
}
