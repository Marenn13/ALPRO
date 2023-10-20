
import java.util.Scanner;


public class soal2 {
     public static void main(String[] args) {
        
         Scanner input= new Scanner (System.in);
         int bil=0, jum = 0;
         
         System.out.println(" masukkan bilangan");
         bil=input.nextInt();
         
         do {
             jum=bil+jum;
             jum++;
         }while (jum>=bil);
             
         }
    
}
