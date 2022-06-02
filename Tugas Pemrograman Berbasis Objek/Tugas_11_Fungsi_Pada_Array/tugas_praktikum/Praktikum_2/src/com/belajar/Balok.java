package com.belajar;

// Made by Adham Nugroho

import java.util.Scanner;


public class Balok {
    public static void main(String[] args) {
     
        // Membuat objek scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        
        // Menghitung luas permukaan balok
        int luasPermukaan = 2 * ( (p * l) + (p * t) + (l * t) );
        System.out.println("\nLuas permukaan Balok adalah: " + luasPermukaan);
        
        // Menghitung volume balok
        int volume = p * l * t;
        System.out.println("Volume Balok adalah: " + volume);
    }
}
