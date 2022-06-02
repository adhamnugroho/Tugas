package com.belajar;

// made by adham_nugroho

public class Varargs {
    
    // deklarasi fungsi tampil
    static void tampil(String pesan, int... angka) {
        System.out.println("String: " + pesan);
        System.out.println("Jumlah argumen / parameter " + angka.length);
        
        for(int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        
        System.out.println("\n");
    }
}
