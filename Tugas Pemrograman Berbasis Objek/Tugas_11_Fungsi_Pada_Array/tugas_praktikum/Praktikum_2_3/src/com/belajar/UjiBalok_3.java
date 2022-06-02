package com.belajar;

// Mengimport fungsi static dari class Balok_3
import static com.belajar.Balok_3.hitungLuasPermukaan;
import static com.belajar.Balok_3.hitungVolume;

import java.util.Scanner;


public class UjiBalok_3 {
    
    public static void main(String[] args) {
        
        // Membuat objek scanner  
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int t = input.nextInt();
        
        // Menutup objek scanner
        input.close();
        
        // Perhitungan
        System.out.println("Luas permukaan Balok adalah: " + hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Balok adalah: " + hitungVolume(p, l, t));
    }
}
