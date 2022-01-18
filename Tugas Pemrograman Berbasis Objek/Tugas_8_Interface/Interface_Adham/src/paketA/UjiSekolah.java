package paketA;


public class UjiSekolah {
    public static void main(String[] args) {
        Guru guru1 = new Guru();
        guru1.setDataGuru(1236766, "Siti", "MAT");
        guru1.info();
        
        
        Siswa siswa1 = new Siswa();
        siswa1.inputDataSiswa(231464765, "Darmo", 90, 87);
        siswa1.info();
    }
}
