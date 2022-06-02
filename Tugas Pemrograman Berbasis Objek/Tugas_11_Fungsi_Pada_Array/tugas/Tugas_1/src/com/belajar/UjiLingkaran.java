package com.belajar;


public class UjiLingkaran {
    
    public static void main(String[] args) {
        
        Lingkaran circle1 = new Lingkaran(4, 5);
        Lingkaran circle2 = new Lingkaran(5, 4);
        
        circle1.show();
        
        System.out.println("Luas dari circle2: " + circle2.getHasilLuas());
    }
}
