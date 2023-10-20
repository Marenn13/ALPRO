

package praktikumtugas;

import java.util.Scanner;


public class akpers {
     public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
      
        double a, b, c, d, x1 = 0, x2;
  
        do {
           
            System.out.print("Koefisien x2 (a) jh= ");
         
            a = inp.nextDouble();

        } while (a == 0);
        System.out.print("Koefisien x (b) = ");
        
        b = inp.nextDouble();
        
        System.out.print("Konstanta (c) = ");
        
        c = inp.nextDouble();
        
        d = (b * b - (4 * a * c));
        
        if (d < 0 || a == 0) {
          
            System.out.println("Tidak Memiliki Akar Nyata");
       
        } else if (d == 0) {
          
            x1 = -b / (2 * a);
        
            System.out.print("Memiliki Akar Tunggal, Yakni = " + x1);
       
        } else {
          
            x1 = (b + Math.sqrt(d)) / (2 * a);
        }
       
        x2 = (b + Math.sqrt(d)) / (2 * a);
       
        System.out.println("Akar Pertama\t= " + x1);
       
        System.out.println("Akar Kedua\t= " + x2);

     }
}

    

