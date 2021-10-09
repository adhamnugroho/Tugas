package com.belajar;

class Lingkaran {
    //Data member
    double jari_jari_adham_prasetyo_suryo_nugroho;
    double phi_adham_prasetyo_suryo_nugroho = 3.14;

    
    // Constructor   
    Lingkaran(double jari_jari_adham_prasetyo_suryo_nugroho){
        this.jari_jari_adham_prasetyo_suryo_nugroho = jari_jari_adham_prasetyo_suryo_nugroho;
    }
    
    
    // setter
    void setJari_Jari(double jari_jari_adham_prasetyo_suryo_nugroho) {
        this.jari_jari_adham_prasetyo_suryo_nugroho = jari_jari_adham_prasetyo_suryo_nugroho;
    }
    
    
    // getter
    double getJari_Jari() {
        return this.jari_jari_adham_prasetyo_suryo_nugroho;
    }
    
    
    // method untuk menghitung luas lingkaran
    double luasLingkaran() {
        return phi_adham_prasetyo_suryo_nugroho * jari_jari_adham_prasetyo_suryo_nugroho * jari_jari_adham_prasetyo_suryo_nugroho;
    }
    
    
    // method untuk menghitung keliling lingkaran
    double kelilingLingkaran() {
        return 2 * phi_adham_prasetyo_suryo_nugroho * jari_jari_adham_prasetyo_suryo_nugroho;
    }
}