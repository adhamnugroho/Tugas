package com.belajar;

import static com.belajar.Varargs.tampil;


public class UjiVarargs {
    
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
