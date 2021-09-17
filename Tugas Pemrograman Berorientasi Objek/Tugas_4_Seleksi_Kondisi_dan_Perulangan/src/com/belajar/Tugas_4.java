package com.belajar;

// Import
import java.util.Scanner;


public class Tugas_4 {
    public static void main(String[] args) {
        
        // Deklarasi variabel
        int input;
        String ulang, ulang_1;
        boolean loop, loop_1;
        
        
        
        // Membuat object Scanner
        Scanner keyboard = new Scanner (System.in);
        
        
        
        // Perulangan "while loop"
        loop_1 = true;
        while(loop_1) {
            
            // Perintah memasukkan input
            System.out.print("Masukkan nilai (1 - 10): ");
            input = keyboard.nextInt();
            
            
            // Perulangan "while loop"           
            loop = true;
            while(loop) {
                
                //Pengkondisian                
                switch(input) {
                    case 1:
                        System.out.println("Satu");
                        break;

                    case 2:
                        System.out.println("Dua");
                        break;

                    case 3:
                        System.out.println("Tiga");
                        break;

                    case 4:
                        System.out.println("Empat");
                        break;

                    case 5:
                        System.out.println("Lima");
                        break;

                    case 6:
                        System.out.println("Enam");
                        break;

                    case 7:
                        System.out.println("Tujuh");
                        break;

                    case 8:
                        System.out.println("Delapan");
                        break;

                    case 9:
                        System.out.println("Sembilan");
                        break;

                    case 10:
                        System.out.println("Sepuluh");
                        break;
                        
                    default:
                        break;
                }
                
                
                // Perintah menanyakan tentang perubahan nilai               
                System.out.print("\nApakah anda ingin mengganti nilai (Y / N)? ");
                ulang = keyboard.nextLine();
                
                switch (ulang) {
                    case "Y":
                        loop = false;
                        break;

                    case "y":
                        loop = false;
                        break;

                    case "N":
                        loop = true;
                        break;

                    case "n":
                        loop = true;
                        break;
                        
                    default:
                        break;
                }
            }
            
            
            // Perintah menanyakan tentang pengulangan(memasukkan nilai)           
            System.out.print("\nAnda ingin mengulang kembali (Y / N)? ");
            ulang_1 = keyboard.nextLine();

            switch (ulang_1) {
                case "Y":
                    loop_1 = true;
                    break;

                case "y":
                    loop_1 = true;
                    break;

                case "N":
                    loop_1 = false;
                    break;

                case "n":
                    loop_1 = false;
                    break;
                        
                default:
                    break;
            }
        }
        
        System.out.println("\nProgram Selesai");
        
        // Menutup object Scanner
        keyboard.close();
    }    
}