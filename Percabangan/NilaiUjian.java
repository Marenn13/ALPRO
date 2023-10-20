/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Percabangan;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class NilaiUjian {
      public static void main(String[] args) {
         Scanner nilai = new Scanner (System.in);
         double nilaiTotal;
         System.out.println("Masukkan nilai UTS 1 : ");
         double uts1=nilai.nextDouble();
         System.out.println("Masukkan nilai UTS 2 : ");
         double uts2=nilai.nextDouble();
         System.out.println("Masukkan nilai UAS : ");
         double uas=nilai.nextDouble();
         nilaiTotal= 0.3 * uts1 + 0.3 * uts2 + 0.4 * uas;
         System.out.println("Nilai total Anda adalah : "+ nilaiTotal);
         
         if ( nilaiTotal >=80){
             System.out.println("Anda mendapat nilai A");
         }else if (nilaiTotal >= 65 && nilaiTotal < 80){
             System.out.println("Anda mendapat nilai B");
         }else if (nilaiTotal >= 55 && nilaiTotal < 65){
             System.out.println("Anda mendapat nilai C");}
         else if (nilaiTotal >= 50 && nilaiTotal < 55){
             System.out.println("Anda mendapat nilai D");}
         else if (nilaiTotal < 50){
             System.out.println("Anda mendapat nilai E");
     }
    
}
}

    

