package com.belajar;


public class Main {
    public static void main(String[] args) {
        
        // Instansiasi / Membuat Object       
        Lingkaran lingkaran_1_adham_prasetyo_suryo_nugroho = new Lingkaran(10);
        
        
        System.out.println("Jari - jari dari lingkaran 1: " + lingkaran_1_adham_prasetyo_suryo_nugroho.getJari_Jari());
        lingkaran_1_adham_prasetyo_suryo_nugroho.setJari_Jari(30);
        System.out.println("Jari - jari dari lingkaran 1: " + lingkaran_1_adham_prasetyo_suryo_nugroho.getJari_Jari());
        
        
        System.out.println(lingkaran_1_adham_prasetyo_suryo_nugroho.kelilingLingkaran());
        System.out.println(lingkaran_1_adham_prasetyo_suryo_nugroho.luasLingkaran());
    }
}