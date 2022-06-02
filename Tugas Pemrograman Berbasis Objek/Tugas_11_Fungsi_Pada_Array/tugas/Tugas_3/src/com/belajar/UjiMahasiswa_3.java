package com.belajar;


public class UjiMahasiswa_3 {
    public static void main(String[] args) {
        
        // Instansiasi
        Mahasiswa_3 kelas_1 = new Mahasiswa_3();
        
        System.out.println("Nilai rata - rata dari 10 mahasiswa adalah: " + kelas_1.getAverage());
        
        System.out.println("Nilai tertinggi dari 10 mahasiswa adalah: " + Mahasiswa_3.nilaiTerbesar());
        System.out.println("Nilai terendah dari 10 mahasiswa adalah: " + Mahasiswa_3.nilaiTerkecil());
        
    }
}
