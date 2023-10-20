

package praktikumtugas;

import java.util.Scanner;


public class lemparDadu {
     public static void main(String[] args) {
        
        int Dadu1, Dadu2;
        int hasilLemparan;
        int jumlah=0;
        
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan jumlah lemparan dadu");
        jumlah=input.nextInt();
        do {
             Dadu1 = (int)(Math.random()*6) + 1;
             Dadu2 = (int)(Math.random()*6) + 1;
             hasilLemparan = Dadu1 + Dadu2;
              System.out.println("Angka pada Dadu Pertama =" + Dadu1);
              System.out.println("Angka pada Dadu Kedua =" + Dadu2);
              System.out.println("Tottal Angka Dadu =" + hasilLemparan);
 } while (hasilLemparan<=jumlah);
            
        }
    }

