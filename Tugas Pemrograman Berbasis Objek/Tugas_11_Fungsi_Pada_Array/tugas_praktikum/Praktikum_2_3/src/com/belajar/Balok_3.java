package com.belajar;

// Made by Adham Nugroho


public class Balok_3 {
    
    static int hitungLuasPermukaan(int p, int l, int t) {
        
        int hasil = 2 * ( (p * l) + (p * t) + (l * t) );
        
        return hasil;
    }
    
    static int hitungVolume(int p, int l, int t) {
        
        int hasil = p * l * t;
        
        return hasil;
    } 
    
}
