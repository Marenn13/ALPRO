

package nestedlooping;

import java.util.Scanner;


public class cetakbariskolom {

   
    public static void main(String[] args) {
        
        Scanner inp=new Scanner (System.in);
        
        System.out.print(" Mencetak Baris dan Kolom = ");
        int N=inp.nextInt();
        for (int j=1; j <= N; j++){
            for (int i = 1; i <= N; i++){
               if (i==j){
                   System.out.printf( "%5d ",1);
                }else {
                    System.out.printf("%5d ",0);
                } 
         
            }System.out.println();
        }
    }
    
}
