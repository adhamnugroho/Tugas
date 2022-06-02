package com.belajar;

// Made by Adham Nugroho

import java.util.Scanner;


class Mahasiswa_3 {
    
    static int listNilai[] = new int[10];
    private static int hasilRataRata;
    

    // Constructor
    Mahasiswa_3() {
       inputNilai();
       averageNilai();
       nilaiTerbesar();
       nilaiTerkecil();
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
            Mahasiswa_3.listNilai[i] = input.nextInt();
            
            m++;
        }
        
        System.out.println();
        
        // Menutup object scanner 
        input.close();
        
        return Mahasiswa_3.listNilai;
    }
    
    // Fungsi untuk menghitung rata - rata nilai mahasiswa
    public static int averageNilai() {
        
        int sum = 0;
        
        for(int avgNilai : Mahasiswa_3.listNilai) {
            
            sum += avgNilai;
        }
        
        return Mahasiswa_3.hasilRataRata = sum / Mahasiswa_3.listNilai.length;
    }
    
    // Fungsi yang digunakan untuk mencari nilai terbesar dari array yang bertipe data primitive
    public static int nilaiTerbesar() {
        
        // digunakan untuk menyimpan elemen array .       
        int max = Mahasiswa_3.listNilai[0];
        
        for (int i = 0; i < Mahasiswa_3.listNilai.length; i++) {
            
            if (Mahasiswa_3.listNilai[i] > max) {
                max = Mahasiswa_3.listNilai[i];
            }
        }
        
        return max;
    }
    
    // Fungsi yang digunakan untuk mencari nilai terkecil dari array yang bertipe data primitive
    public static int nilaiTerkecil() {
        
        // digunakan untuk menyimpan elemen array.       
        int min = Mahasiswa_3.listNilai[9];
        
        for (int i = 0; i < Mahasiswa_3.listNilai.length; i++) {
            
            if(Mahasiswa_3.listNilai[i] < min) {
                min = Mahasiswa_3.listNilai[i];
            }
        }
        
        return min;
    }
    
    // digunakan untuk menampilkan hasil rata - rata saja.   
    public int getAverage() {
        return Mahasiswa_3.hasilRataRata;
    }
    
    // fungsi untuk mencetak nilai
    public void show() {
        System.out.println("Nilai rata - rata dari 10 mahasiswa adalah: " + hasilRataRata);
        System.out.println("Nilai tertinggi dari 10 mahasiswa adalah: " + nilaiTerbesar());
        System.out.println("Nilai terendah dari 10 mahasiswa adalah: " + nilaiTerkecil());
    }
}