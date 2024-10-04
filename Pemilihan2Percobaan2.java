import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);

        String member;
        int menu;
        double harga = 0, totalBayar, diskon = 0 ;

        System.out.print("-------------------------");
        System.out.print("===== MENU KAFE JTI =====");
        System.out.print("-------------------------");
        System.out.print(" 1. Rice Bowl ");
        System.out.print(" 2. Ice  tea ");
        System.out.print(" 3. Paket Bundling (Rice bowl + ice tea) ");
        System.out.print("-------------------------");
        System.out.print(" Masukkan angka dari menu yang anda pilih: ");
        menu = Absen.nextInt();
        Absen.nextLine();
        System.out.print(" Apakah memiliki member (y/n) ? = ");
        member = Absen.nextLine();
        System.out.println("-----------------------------------------");
         
        if (menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (menu == 3) {
            harga = 15000;
            System.out.println("Harga Paket Bunding = " + harga);
        } else {
            System.out.println(" Masukkan pilihan menu dengan benar ");
            return;
        } System.out.println("Total bayar " + harga);
         
        } 
        

    }

