package com.belajar;

// Made by Adham Nugroho

public class Program_1 {
    public static void main(String[] args) {
        
        // Deklarasi array
        int[][] nilai = new int[2][4];
        
        // Pengisian array
        // Baris dan Kolom
        nilai[0][0] = 12;
        nilai[0][1] = 14;
        nilai[0][2] = 34;
        nilai[0][3] = 45;
        nilai[1][0] = 30;
        nilai[1][1] = 21;
        nilai[1][2] = 67;
        nilai[1][3] = 85;
        
        // Menampilkan array
        // Looping Baris       
        for(int i = 0; i < nilai.length; i++) {
            
            // Looping Kolom
            for(int j = 0; j < nilai[0].length; j++) {
                
                System.out.print(nilai[i][j] + " ");
            }
            
            System.out.println("");
        }
        
    }
}
