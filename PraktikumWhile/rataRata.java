

package praktikumwhile;

import java.util.Scanner;


public class rataRata {
     public static void main(String[] args) {
                 Scanner inp=new Scanner (System.in);
       
        int putar, nilai;
       
        double jumlah, nilaiX, rerata;
         
        System.out.print("Banyak data yang akan diproses : ");
        
        nilai=inp.nextInt();
       
        jumlah = 0;
        
        putar=1;
       
        while (putar<=3){
            System.out.print("Data ke "+putar+" :");
           
            nilaiX=inp.nextDouble();
           
            jumlah += nilaiX;
            
            putar++;
        }
       
        rerata=jumlah/nilai;
        
        System.out.print("Rata-rata : "+rerata);
         System.out.println();
     }
}

     
    

