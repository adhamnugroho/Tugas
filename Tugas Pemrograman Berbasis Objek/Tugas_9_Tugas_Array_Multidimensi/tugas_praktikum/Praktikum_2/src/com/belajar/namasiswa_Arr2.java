package com.belajar;

// Made By Adham Nugroho

public class namasiswa_Arr2 {
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
        //Looping Baris        
        for(int i = 0; i < 2; i++) {
            
            // Looping Kolom           
            for(int j = 0; j < 3; j++) {
                
                System.out.print(nilai[i][j] + " ");  
            }
            
            System.out.println("");
        }
        
    }
}
