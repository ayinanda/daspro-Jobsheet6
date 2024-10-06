import java.util.Scanner;

public class TUGAS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran = 0 , harga = 0;
        

        System.out.print(" Masukkan merk : ");
        merk= sc.nextLine();


        if (merk.equalsIgnoreCase("Converse")) {
            System.out.print( " Masukkan kategori (Slip On/High Top) : ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("Slip On")) {
                System.out.println(" Masukkan ukuran (36-40) : ");
                ukuran = sc.nextInt();
                harga = 800000;
                
            } else if (kategori.equalsIgnoreCase("High top")) {
                System.out.print(" Masukkan ukuran (40-44) : ");
                ukuran = sc.nextInt();
                harga = 1200000;

            } else  {
                System.out.print(" Kategori tidak valid ");
                return;
            }
            
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            System.out.print(" Masukkan kategori (Woman/Man) : ");
            kategori = sc.nextLine();
            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.print("Masukkan ukuran (36-41) : ");
                ukuran = sc.nextInt();
                harga = 1000000;
                
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.print(" Masukkan ukuran (41-44) : ");
                ukuran = sc.nextInt();
                harga = 1800000;

            } else {
                System.out.print(" Kategori tidak valid ");
            
            }
            
        } else if (merk.equalsIgnoreCase("Nike")) {
            System.out.print(" Masukkan kategori (Kids/Adult)");
            kategori = sc.nextLine();
            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.print(" Masukkan ukuran (36-40) : ");
                ukuran = sc.nextInt();
                harga = 750000;
                
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.print(" Masukkan ukuran (40-44) : ");
                ukuran = sc.nextInt();
                harga = 1500000;
                
            } else {
                System.out.print(" Kategori tidak valid ");
                return;
                
            }
            
        }   System.out.print(" Anda ingin membeli sepatu merek " + merk);
            System.out.print( " Dengan ukuran : " + ukuran);
            System.out.print( " Dengan Harga : " + harga); 
        {
            
        }
            
        }

    }
    
