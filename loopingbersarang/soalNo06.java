
package loopingbersarang;

import java.util.Scanner;


public class soalNo06 {
   public static void main(String[] args) {
       
       Scanner inp=new Scanner (System.in);
       
       System.out.print(" Masukkan Baris dan Kolom = ");
       int N= inp.nextInt();
       for ( int i=1; i <=5; i++){
           for ( int j=1; j <= 5; j++){
               if ( j==i){
                   System.out.printf("%5d",1);
               }else {
                   System.out.printf("%5d",0);
               }
           }System.out.println();
       }
   }
        
    
}
