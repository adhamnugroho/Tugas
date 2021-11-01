package com.belajar;


public class Nasabah {
    //data nasabah
    String nama_nasabah;
    String keterangan_jumlah_saldo = "-";
    int jumlah_saldo_1;
    int no_rekening;
    
    
    //contructor 1
    public Nasabah(int no_rekening, String nama_nasabah, int jumlah_saldo_1){
        this.no_rekening = no_rekening;
        this.nama_nasabah = nama_nasabah;
        this.jumlah_saldo_1 = jumlah_saldo_1;
    }
    
    
    //contructor 2
    public Nasabah(int no_rekening, String nama_nasabah, String keterangan_jumlah_saldo) {
        this.no_rekening = no_rekening;
        this.nama_nasabah = nama_nasabah;
        this.keterangan_jumlah_saldo = keterangan_jumlah_saldo;
    }
    
    
    public void show() {
        System.out.println("Nomer Rekening: " + this.no_rekening);
        System.out.println("Nama Nasabah: " + this.nama_nasabah);
        System.out.println("Jumlah Saldo: " + this.jumlah_saldo_1);
        System.out.println("Keterangan Jumlah Saldo: " + this.keterangan_jumlah_saldo + "\n");
    }
}
