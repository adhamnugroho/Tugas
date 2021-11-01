package com.belajar;


public class Ujiharga {
    public static void main(String[] args) {
        Harga_Bulpoin bulpoin_1 = new Harga_Bulpoin();
        System.out.println("Harga Bulpoin: " + bulpoin_1.inputHarga(1000));
        Harga_Bulpoin bulpoin_2 = new Harga_Bulpoin();
        System.out.println("Harga Bulpoin: " + bulpoin_1.inputHarga("Seribu"));
    }
}
