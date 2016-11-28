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
    
    List<Person> ksiazka = new ArrayList<Person>();
    
    public class Person {
        
        String Imie, Nazwisko;
        int Telefon;
        
        public void ustaw(String imie, String nazwisko, int telefon) {
            
            this.Imie=imie;
            this.Nazwisko=nazwisko;
            this.Telefon=telefon;
           
        }
        
        public void wysw() {
            System.out.printf("%-20s",Nazwisko);
            System.out.printf("%-20s",Imie);
            System.out.printf("%-20s",Telefon);
            System.out.println();
            
        }
            
        
    }
    
    public void dod_do_ksiazka() {
        
        Scanner sc = new Scanner (System.in);
        Person p = new Person();
        String im, nazw;
        int tel;
        boolean war = false;
        
        System.out.println("podaj dane do książki");
        System.out.println("Imie:");
        im = sc.nextLine();
        
        System.out.println("Nazwisko:");
        nazw = sc.nextLine();
        
        System.out.println("Telefon:");
        tel = Integer.parseInt(sc.nextLine());
        
        p.ustaw(im, nazw, tel);
        
        if (ksiazka.size()==0) {
            ksiazka.add(p);
        } else {
            for (int i=0; i<ksiazka.size(); i++) {
                if (ksiazka.get(i).Nazwisko.compareTo(p.Nazwisko)>0){
                    ksiazka.add(i,p);
                    war=true;
                    break;
                }
                if (ksiazka.get(i).Nazwisko.compareTo(p.Nazwisko)==0) {
                    war=true;
                    if (ksiazka.get(i).Imie.compareTo(p.Imie)>0){
                        ksiazka.add(i,p);
                        war=true;
                        break;
                    }
                }
                if (war==true && ksiazka.get(i).Nazwisko.compareTo(p.Nazwisko)<0) {
                    ksiazka.add(i,p);
                    break;
                }
            }
            if (war==false) {
                ksiazka.add(p);
            }
        }
        
        
    }
    
    public void wysw_ksiazka() {
        
        System.out.println("------------------------------------------------");
        System.out.println("Nazwisko:           Imie:               Telefon:");
        
        for (int i=0; i<ksiazka.size(); i++) {
            
            ksiazka.get(i).wysw();
        
        }
        
        System.out.println("------------------------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cw2 ks = new Cw2();
        
        Scanner s = new Scanner (System.in);
        String wybor;
        boolean wyb=false;
        
        while (wyb==false) {  
            System.out.println("Wybierz opcje:");
            System.out.println("1 - Dodaj do ksiazki adresowej");
            System.out.println("2 - Wyswietl ksiazke adresową");
            System.out.println("3 - Wyjście");
            wybor = s.nextLine();
            switch (wybor) {
                case "1": ks.dod_do_ksiazka();
                    break;
                case "2": ks.wysw_ksiazka();
                    break;
                case "3": wyb = true;
                    break;
                default:  System.out.println("Błędny wybór");
                    break;
            }
        }
 
        
        
    }
    
}
