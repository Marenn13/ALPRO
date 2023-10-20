
package Percabangan;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        
         Scanner input= new Scanner (System.in);
         int bil1=0, bil2=1, bilulang=0, bilinput = 0;
         int  jumlah=0;
          System.out.print(" masukkan angka =");
          bilinput= input.nextInt();
          System.out.println("deret fibonacci"+jumlah+" = ");
          System.out.print(jumlah);
          
          do {
              jumlah= bil1+bil2;
              bil2=bil1;
              bil1=jumlah;
              
              System.out.println(""+jumlah);
              bilulang++;
              }  while (bilulang<=bilinput);
    
}
}
