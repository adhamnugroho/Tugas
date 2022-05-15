package com.belajar;

//Made by Adham Nugroho

import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        
        // Membuat object Scanner
        Scanner input = new Scanner(System.in);
        
        // Deklarasi Array       
        int nilai[][] = new int[2][3];
        
        // Looping untuk membuat input ke variabel array nilai
        // Looping luar
        for(int i = 0; i < 2; i++) {
            // Looping dalam
            for(int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "] [" + j +"]: ");
                nilai[i][j] = input.nextInt();
                
                System.out.println("J: " + j);
            }
            
            System.out.println("-------------------------");
            
            System.out.println("i: " + i);
        }
        
        // Menutup object scanner       
        input.close();
        
        // Looping untuk menampilkan elemen array nilai
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            
            System.out.println("");
        }
        
    }
}
