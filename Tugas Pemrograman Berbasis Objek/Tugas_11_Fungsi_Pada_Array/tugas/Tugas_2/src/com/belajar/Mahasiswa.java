package com.belajar;

// Made by Adham Nugroho

import java.util.Scanner;


class Mahasiswa {
    
    static int listNilai[] = new int[10];
    static int hasilRataRata;
    

    // Constructor
    Mahasiswa() {
       inputNilai();
       averageNilai();
    }
    
    
    // Fungsi untuk mengisi array listNilai
    public static int[] inputNilai() {
        
        // Variabel untuk tampilan urutan mahasiswa      
        int m = 1;
        
        // Membuat object scanner 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai dari 10 mahasiswa, secara satu - persatu!");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Masukkan nilai mahasiswa ke-[" + m + "]: ");
            Mahasiswa.listNilai[i] = input.nextInt();
            
            m++;
        }
        
        System.out.println();
        
        // Menutup object scanner 
        input.close();
        
        return Mahasiswa.listNilai;
    }
    
    // Fungsi untuk menghitung rata - rata nilai mahasiswa
    public static int averageNilai() {
        
        int sum = 0;
        
        for(int avgNilai : Mahasiswa.listNilai) {
            
            sum += avgNilai;
        }
        
        return Mahasiswa.hasilRataRata = sum / Mahasiswa.listNilai.length;
    }
    
    // digunakan untuk menampilkan hasil rata - rata saja.   
    public int getAverage() {
        return Mahasiswa.hasilRataRata;
    }
    
    // fungsi untuk mencetak nilai
    void show() {
        System.out.println("Nilai rata - rata dari 10 mahasiswa adalah: " + hasilRataRata);
    }
}
