/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner (System.in);
          int pil;
        for (int i=0;i <= 30;i++){
            System.out.print("-");}
          System.out.println();
          System.out.println(" MENU");
          for (int j=0;j<=10;j++){
              System.out.print("=");}
          System.out.println();
          System.out.println(" 1. Hitung Luas Segitiga");
          System.out.println(" 2. Hitung Luas Lingkaran");
          System.out.println(" 3. Selesai");
          System.out.println();
          
          for (int k=0;k<=10;k++){
              System.out.print("-");}
            System.out.println();
            System.out.println(" masukkan pilihan anda"); 
            pil=inp.nextInt ();
            switch (pil){ 
                case 3 : System.out.println(" Terimakasih");
                         break;
                default: System.out.println(" Bukan Pilihan");}
            
    
}
    }

 