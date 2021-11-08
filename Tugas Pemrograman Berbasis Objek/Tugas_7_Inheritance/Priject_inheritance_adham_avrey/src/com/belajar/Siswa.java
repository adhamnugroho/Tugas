package com.belajar;


public class Siswa extends Sekolah{
    
    // Data Member   
    private int nis;
    private int uts;
    private int uas;
    private int nilaiAkhir;
    private String nilaiHuruf;
    
    
    public Siswa() {
        inputDataSiswa(0, "-", 0, 0, 0, "-");
    }
    
    public void inputDataSiswa(int nis, String nama,int uts, int uas, int nilaiAkhir, String nilaiHuruf) {
        this.nis = nis;
        super.nama = nama;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = nilaiAkhir;
        this.nilaiHuruf = nilaiHuruf;
    }
    
    
    public int getNis() {
        return this.nis;
    }
    
    
    public String getNama() {
        return super.nama;
    }
    
    
    public int getUts() {
        return this.uts;
    }
    
    
    public int getUas() {
        return this.uas;
    }
    
    
    public int getNilaiAkhir() {
        return this.nilaiAkhir;
    }
    
    
    public String getNilaiHuruf() {
        return this.nilaiHuruf;
    }
    
    
    public void info() {
        System.out.println("NIS: " + this.nis);
        System.out.println("Nama: " + super.nama);
        System.out.println("Nilai UTS: " + this.uts);
        System.out.println("Nilai UAS: " + this.uas);
        System.out.println("Nilai Akhir: " + this.nilaiAkhir);
        System.out.println("Keterangan Nilai: " + this.nilaiHuruf + "\n");
    }
}