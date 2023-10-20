
package praktikumtugas;

import java.util.Scanner;


public class nilaiFinal {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
       
        int uts1, uts2, uas ;
        double total;
        do {
         System.out.print("Nilai UTS 1 : ");
            uts1 = inp.nextInt();
        }
        while (uts1 < 0 );
   
        do {
           
            System.out.print("Nilai UTS 2 : ");
            uts2 = inp.nextInt();}
        while (uts2 < 0);
      
     do {
            System.out.print("Nilai UAS : ");
            uas = inp.nextInt();
        }
        while (uas < 0);
        
        total = ( (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas) );
        
        if (total >= 80){
            System.out.println("Anda Mendapat Nilai A");
        }
        else  if ( total <= 65 && total < 80){
            System.out.println("Anda Mendapat Nilai B");
        }
        else if (total <= 55 && total < 65){
            System.out.println("Anda Mendapat Nilai C");
        }
        else if (total <= 50 && total < 55){
            System.out.println("Anda Mendapat Nilai D");
        }
        else if (total < 50){
           
        }


    }

}

    

