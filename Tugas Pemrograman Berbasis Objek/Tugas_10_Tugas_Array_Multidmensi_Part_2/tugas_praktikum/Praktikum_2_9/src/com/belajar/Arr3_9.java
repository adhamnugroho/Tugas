package com.belajar;

// Made by Adham Nugroho

// Menambahkan baris kode, agar jumlah baris dan kolom dapat ditambahkan secara dinamis di array 2 dimensi


import java.util.Scanner;


public class Arr3_9 {
    public static void main(String[] args) {
        // Membuat object Scanner
        Scanner input = new Scanner(System.in);
        
        int jumlahBaris;
        int jumlahKolom;
        
        // User memasukkan jumlah baris       
        System.out.print("Masukkan jumlah baris yang anda inginkan: ");
        jumlahBaris = input.nextInt();
        
        // User memasukkan jumlah kolom setiap baris       
        System.out.print("Masukkan jumlah kolom yang anda inginkan: ");
        jumlahKolom = input.nextInt();
        System.out.println();
        
        // Deklarasi Array       
        int values[][] = new int[jumlahBaris][jumlahKolom];
        
        
        int i = 0;
        int j = 0;
          
        // Looping untuk membuat input ke variabel array nilai
        // Looping luar
        while (i < jumlahBaris) {
            // Looping dalam
            do {
                System.out.print("Masukkan nilai ke-[" + i + "] [" + j +"]: ");
                values[i][j] = input.nextInt();
                
                j++;
                
            } while(j < jumlahKolom);
            
            System.out.println("-------------------------");
            
            // Pengkondisian untuk mereset nilai dari variabel j           
            if(j == jumlahKolom) {    
                j = 0;
            }  
            
            i++;
            
        }
        
        // Pengkondisian untuk mereset nilai dari variabel i
        if(i == jumlahBaris) {
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
