package com.belajar;

// Made by Adham Nugroho


public class Task_2 {
    public static void main(String[] args) {
        
        // Deklarasi array       
        int RGB[][][] = {
            {
                {2, 2, 3},
                {5, 6, 7}
            },
            {
                {6, 8, 5},
                {5, 2, 6}
            }
        };
        
        // Menampilkan array
        // Dimensi 3       
        for (int i = 0; i < RGB.length; i++) {
            
            // Dimensi 2           
            for (int j = 0; j < RGB[1].length; j++) {
                
                // Dimensi 1               
                for (int k = 0; k < RGB[0][1].length; k++) {
                    
                    System.out.print(RGB[i][j][k] + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
