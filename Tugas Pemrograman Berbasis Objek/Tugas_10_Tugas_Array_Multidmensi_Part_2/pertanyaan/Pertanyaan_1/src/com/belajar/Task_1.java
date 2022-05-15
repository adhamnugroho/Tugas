package com.belajar;

// Made by Adham Nugroho


public class Task_1 {
    public static void main(String[] args) {
        
        // Deklarasi array       
        int RGB[][][] = {
            {
                {2, 2, 3},
                {5, 6, 7}
            },
            {
                {6, 8, 5},
                {5, 2}
            }
        };
        
        // Menampilkan array
        // Dimensi 3       
        for (int i = 0; i < 2; i++) {
            
            // Dimensi 2           
            for (int j = 0; j < 2; j++) {
                
                // Dimensi 1               
                for (int k = 0; k < 3; k++) {
                    
                    System.out.print(RGB[i][j][k] + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
        
    }
}
