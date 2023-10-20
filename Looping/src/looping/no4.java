/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package looping;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class no4 {
     public static void main(String[] args) {
         int pilih=1;
         Scanner input=new Scanner (System.in);
         
       do{
         System.out.println(" TES MENU");
         System.out.println("----------------------");
         System.out.println("1. cetak hallo \n 2. cetak hai \n 3. selesai");
         System.out.println("---------------------");
         System.out.println("pilihan anda :");
         pilih=input.nextInt();
         switch(pilih){
             case 1:System.out.println("hallo");
             break;
                   case 2:System.out.println("hai");
             break;
                         case 3:System.out.println("Selesai");
                             System.out.println("Terima Kasih");
             break;
                         default: System.out.println("masukkan angka lain");
                       
         }
       }
             
             while( pilih != 3);{
                 
             }
             
             
             
             
         }
       
             
         
         
     }
    

