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
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner inp=new Scanner (System.in);
         int pil ;
         double alas = 0,tinggi,luas;
        
           garisSatu ();
          System.out.println(" Menu ");
          garisDua ();
          System.out.println(" 1. Luas Segitiga");
          System.out.println(" 2. luas lingkaran");
          System.out.println(" 3. selesai");
          garisSatu ();
          System.out.print("pilihan anda  : ");
          pil=inp.nextInt ();
          switch (pil){
              case 1 :luasSegi3();
                  break;
              case 2 :
          }
         
    }
    private static void garisDua() {
        
      for (int i=0;i <= 30;i++){
            System.out.print("=");}
          System.out.println();  
    }

    private static void luasSegi3() {
         Scanner inp=new Scanner (System.in);
          System.out.print(" masukkan alas : ");
                   double alas=inp.nextDouble ();
                    System.out.print(" masukkan tinggi ");
                    double tinggi=inp.nextDouble ();
                    double luas= 0.5 * alas *tinggi;
                   System.out.println(""+luas);
                   System.out.println();
                   garisSatu ();   
    }
    private static void garisSatu() {
         for (int i=0;i <= 30;i++){
            System.out.print("-");}
          System.out.println(); 
    }

    private static void garis(int i, String string) {
        
    }
    }

    
    

