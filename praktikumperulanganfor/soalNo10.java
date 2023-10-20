

package praktikumperulanganfor;

import java.util.Scanner;


public class soalNo10 {
    public static void main(String[] args) {
    Scanner inp=  new Scanner (System.in);
    
    int i = 0,jumlah,k, tinggi = 0;
        System.out.println("== Piramida Terbalik ==");
        System.out.println();
        System.out.print(" tinggi piramida =");
        tinggi=inp.nextInt ();
        
       for ( i =0; i <=tinggi; i++){
            for ( jumlah=1; jumlah <= tinggi; jumlah++){
              System.out.print("");
            }
            
            for (k  = 1;  k <= tinggi-i;k ++) {
               System.out.print("*");
            }
            System.out.println();
       }
                
          
        }
}
    

