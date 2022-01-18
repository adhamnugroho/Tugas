package paketA;

import paketB.Rumus;

public class Siswa extends Sekolah implements Rumus{
    // Data member
    private int nis;
    private int uts;
    private int uas;
    
    
    // Data function
    
    // Constructor
    public Siswa() {
        inputDataSiswa(0, "-", 0, 0);
    }
    
    // Method input data siswa   
    public void inputDataSiswa(int nis, String nama, int uts, int uas) {
        this.nis = nis;
        super.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
    
    // Method get nis
    public int getNis() {
        return this.nis;
    }
        
    // Method get nama
    public String getNama() {
        return super.nama;
    }
    
    // Method get uts
    public int getUts() {
        return this.uts;
    }
    
    // Method get uas
    public int getUas() {
        return this.uas;
    }
    
    // Method sort ascending
    @Override
    public void sortAsc() {
        
    }
    
    // Method get average
    @Override
    public double getAverage() {
        return (this.uts + this.uas) / 2;
    }
    
    // Method get nilai akhir
    @Override
    public double getNilaiAkhir() {
        return getAverage();
    }
    
    // Method get nilai huruf
    public String getPredikat() {
        if(getAverage() >= 0 && getAverage() < 50) {
            return "Selamat anda mendapatkan predikat F";
        } else if(getAverage() >= 50 && getAverage() < 60) {
            return "Selamat anda mendapatkan predikat E";
        } else if(getAverage() >= 60 && getAverage() < 70) {
            return "Selamat anda mendapatkan predikat D";
        } else if(getAverage() >= 70 && getAverage() < 80) {
            return "Selamat anda mendapatkan predikat C";
        } else if(getAverage() >= 80 && getAverage() < 90) {
            return "Selamat anda mendapatkan predikat B";
        } else if(getAverage() >= 90 && getAverage() < 100) {
            return "Selamat anda mendapatkan predikat A";
        } else {
            return "Nilai yang anda masukkan tidak sesuai";
        }
    }
    
    // Method info
    @Override
    public void info() {
        System.out.println("NIS: " + this.nis);
        System.out.println("Nama: " + super.nama);
        System.out.println("Nilai UTS: " + this.uts);
        System.out.println("Nilai UAS: " + this.uas);
        System.out.println("Nilai Akhir: " + getNilaiAkhir());
        System.out.println("Nilai Huruf: " + getPredikat() + "\n");
    }
    
}
