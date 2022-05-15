package com.belajar;

//Made by Adham Nugroho

//while, do while, dan foreach

import java.util.Scanner;


public class Arr3_7_8 {
    public static void main(String[] args) {
        
        // Membuat object Scanner
        Scanner input = new Scanner(System.in);
        
        // Deklarasi Array       
        int values[][] = new int[2][3];
        
        int i = 0;
        int j = 0;
        
        // Looping untuk membuat input ke variabel array nilai
        // Looping luar
        while (i < 2) {
            // Looping dalam
            do {
                System.out.print("Masukkan nilai ke-[" + i + "] [" + j +"]: ");
                values[i][j] = input.nextInt();
                
                j++;
                
            } while(j < 3);
            
            System.out.println("-------------------------");
            
            // Pengkondisian untuk mereset nilai dari variabel j           
            if(j == 3) {    
                j = 0;
            }  
            
            i++;
            
        }
        
        // Pengkondisian untuk mereset nilai dari variabel i
        if(i == 2) {
            i = 0;
        } 
        
        // Menutup object scanner       
        input.close();
        
        // Looping untuk menampilkan elemen array nilai
        for(int value[] : values) {
            for(int vle: value) {
                System.out.print(vle + " ");
            }
            
            System.out.println();
            
        }
    }
}
