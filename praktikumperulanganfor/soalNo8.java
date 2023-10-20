

package praktikumperulanganfor;

import java.util.Scanner;


public class soalNo8 {
     public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
         int i,b, besar;
         System.out.println(" === Membuat bintang ===");
         
         System.out.print(" Besar Bintang = ");
         besar=input.nextInt();
         for (i=0; i <= besar; i++){
             for( b=1; b <= besar; b++){
                 System.out.print("*");
             } System.out.println();
         }
     }
    
}
