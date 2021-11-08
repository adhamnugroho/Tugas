package com.belajar;


public class TesSekolah {
    public static void main(String[] args) {
        Guru guru1 = new Guru();
        guru1.setDataGuru(1233671287, "Tutik", "MAT");
        guru1.info();
        
        
        Siswa siswa1 = new Siswa();
        siswa1.inputDataSiswa(2136530984, "Nasrudin", 40, 50, 90, "Sembilan Puluh");
        siswa1.info();
        
        
        Sekolah sekolah1 = new Sekolah();
        sekolah1.info();
    }
}