package com.belajar;

// Made By Adham Nugroho

public class namasiswa_Arr1 {
    public static void main(String[] args) {
        
        // Deklarasi array
        int[][] nilai = new int[2][3];
        
        // Pengisian array
        // Baris dan Kolom
        nilai[0][0] = 12;
        nilai[0][1] = 14;
        nilai[0][2] = 34;
        nilai[1][0] = 30;
        nilai[1][1] = 21;
        nilai[1][2] = 67;
        
        // Menampilkan array
        System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
        System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
    }
}
