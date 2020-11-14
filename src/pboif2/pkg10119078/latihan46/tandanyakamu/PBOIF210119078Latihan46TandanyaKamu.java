/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan46.tandanyakamu;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age(2020);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan tahun lahir anda: ");
        age.setYearBirth(scanner.nextInt()); 
        System.out.println("Hari ini tahun: " +age.getYearNow());
        age.tandanyaKamu(age.hitungUmur());
    }
    
}
