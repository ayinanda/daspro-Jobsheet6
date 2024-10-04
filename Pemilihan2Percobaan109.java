import java.util.Scanner;

public class Pemilihan2Percobaan109 {

    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);

        int tahun;

        System.out.println(" Masukkan tahun ");
        tahun = Absen.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) 
            if ((tahun % 400 ) == 0) {
                System.out.print( tahun + "  Tahun Kabisat  ");
         } else {
            System.out.println( tahun + "bukan Tahun Kabisat ");
         } else {
            System.out.println( tahun + " Tahun Kabisat ");
         } 
         }else {
            System.out.println(tahun + "bukan Tahun Kabisat ");
         }
            
          }
        }
       


    
            
        
    
