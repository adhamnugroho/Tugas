package com.belajar;

// Made by Adham Nugroho


public class Programku {
    
    // Fungsi digunakan untuk mengambil angka satu - persatu   
    public static void tampilHinggaKeI(int i) {
        
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        
        System.out.println();
    }
    
    // Fungsi digunakan untuk menjumlah 2 bilangan   
    public static int jumlah(int bil1, int bil2){
        return bil1 + bil2;
    }
    
    // Fungsi yang digunakan untuk merangkap fungsi jumlah dan tampilHinggaKeI. 
    public static void tampilJumlah(int bil1, int bil2) {
        tampilHinggaKeI(jumlah(bil1, bil2));
    }
    
    
}
