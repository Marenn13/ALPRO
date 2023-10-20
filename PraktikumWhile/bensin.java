/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikumwhile;

/**
 *
 * @author L E N O V O
 */
public class bensin {
      public static void main(String[] args) {
           int liter=1,jumlah=0, harga=6500;
         System.out.println(" harga perliter 6500");
         System.out.println(" jumlah liter \t harga (Rp)");
         System.out.println(" ========================================");
         
         while (liter <=20){
             System.out.print(+liter+"\t \t");
            liter++;
            System.out.println(harga);
            harga=harga+6500;}
             System.out.println("=======================================");
         
    
}}
