/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Looping;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class soalNo10 {
    public static void main(String[] args) {
         Scanner inp=new Scanner (System.in);
          System.out.print("Banyak baris : ");
        int bb = inp.nextInt(); 
        int spasi = bb; 
        int angka = 1 ;
        for (int k = 0; k<=bb; k++){ 
        
            for (int i = 0; i<=spasi; i++){
                System.out.print(" ");
            }
            angka = 1;
            for ( int j = 0; j<=k ; j++) { 
                System.out.print(angka+ " ");
            angka = angka *(k-j)/(j+1);
            }
            spasi--;
            System.out.println(""); 
     }
    
}
}
