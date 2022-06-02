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
    
    
    public static void main(String[] args) {
        
        // function with two argument int array
        tampil("Daspro 2019", 100, 200);
        
        // function with five argument int array
        tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        
        // function with zero argument int array
        tampil("Polinema");
        
        // function with int array implisit in a variable
        int angka[] = {1, 2, 3, 4};
        tampil("Malang", angka);
    }
}
