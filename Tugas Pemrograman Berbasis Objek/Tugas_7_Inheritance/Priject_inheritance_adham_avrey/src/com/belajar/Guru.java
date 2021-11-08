package com.belajar;


public class Guru extends Sekolah {
    //Data member
    private int NIP;
    private String mapel;
    
    
    //Contuctor
    public Guru(){
        setDataGuru(0, "-", "-");
    }
    
    
    // method untuk mengset data guru
    public void setDataGuru(int NIP, String nama, String mapel){
        this.NIP = NIP;
        super.nama = nama;
        this.mapel = mapel;
    }
    
    
    //method untuk mengambil nilai dari NIP
    public int getNIP() {
        return this.NIP;
    }


    //method untuk mengambil nilai dari nama
    public String getNama() {
        return super.nama;
    }
    
    
    //method untuk mengambil nilai dari mapel
    public String getMapel() {
        return this.mapel;
    }
    
    
    public void info() {
        System.out.println("Nip: "+this.NIP);
        System.out.println("Nama: "+super.nama);
        System.out.println("Mapel: "+this.mapel + "\n");
    }
}
