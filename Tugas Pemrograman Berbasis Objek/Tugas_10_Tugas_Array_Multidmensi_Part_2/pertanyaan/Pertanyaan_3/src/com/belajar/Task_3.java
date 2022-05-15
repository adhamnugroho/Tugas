package com.belajar;


public class Task_3 {
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
        for (int array2D[][] : RGB) {
            
            // Dimensi 2           
            for (int array1D[] : array2D) {
                
                // Dimensi 1               
                for (int x : array1D) {
                    
                    System.out.print(x + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
