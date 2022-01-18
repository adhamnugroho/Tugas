package paketA;


public class Guru extends Sekolah{
    // Data member
    private int nip;
    private String mapel;
    
    
    // Data Function
    
    // Constructor
    public Guru() {
        setDataGuru(0, "-", "-");
    }
    
    // Method data guru
    public void setDataGuru(int nip, String nama, String mapel) {
        this.nip = nip;
        super.nama = nama;
        this.mapel = mapel;
    }
    
    // Method get nip
    public int getNip() {
        return this.nip;
    }
    
    // Method get nama
    public String getNama() {
        return super.nama;
    }
    
    // Method get mapel
    public String getMapel() {
        return this.mapel;
    }
    
    // Method info
    @Override
    public void info() {
        System.out.println("NIP: " + this.nip);
        System.out.println("Nama: " + super.nama);
        System.out.println("Mapel: " + this.mapel + "\n");
    }
}
