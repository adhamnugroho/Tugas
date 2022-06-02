package com.belajar;

// Made by Adham Nugroho

class Lingkaran {
    
    private static int hasilLuas;
    private static int hasilKeliling;
    
    private int r_1, r_2;
    
    Lingkaran(int r_1, int r_2) {
        hitungLuasLingkaran(r_1, r_2);
        hitungKelilingLingkaran(r_1, r_2);
    }
    
    
    // Fungsi untuk menghitung luas lingkaran (with void)
    public static void hitungLuasLingkaran(int r_1, int r_2) {
        
        Lingkaran.hasilLuas = (int) (3.14 * r_1 * r_2);
    }
    
    // Fungsi untuk menghitug keliling lingkaran (with return statement)
    public static int hitungKelilingLingkaran(int r_1, int r_2){
        
        hasilKeliling = (int) (2 * 3.14 * r_1 * r_2);
        
        return Lingkaran.hasilKeliling;
    }
    
    public int getHasilLuas() {
        return Lingkaran.hasilLuas;
    }
    
    public int getHasilKeliling() {
        return Lingkaran.hasilKeliling;
    }
    
    public void show() {
        System.out.println("Luas Lingkaran ini adalah: " + Lingkaran.hasilLuas);
        System.out.println("Keliling Lingkaran ini adalah: " + Lingkaran.hasilKeliling);
    }
}
