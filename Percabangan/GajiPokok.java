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
public class GajiPokok {
      public static void main(String[] args) {
         double gajipokok;
         int golongan, masakerja;
         double bonus=0;
         
         Scanner input = new Scanner (System.in);
         
         System.out.print(" masukkan gaji pokok :");
         gajipokok=input.nextDouble();
         System.out.print(" masukkan golongan :");
         golongan=input.nextInt();
         System.out.print("masukan masa kerja :");
          masakerja= input.nextInt();
          
          if (golongan==1 && masakerja >=0 && masakerja <=10){
              bonus=gajipokok * 0.5;
          }else if (golongan==1 && masakerja >=11 && masakerja <=20){
              bonus=gajipokok * 0.6;
         } else if (golongan==1 && masakerja >=21 && masakerja <=30){
              bonus=gajipokok * 0.7;}
         else if (golongan==2 && masakerja >=0 && masakerja <=10){
              bonus=gajipokok * 0.6;}
         else if (golongan==2 && masakerja >=11 && masakerja <=20){
              bonus=gajipokok * 0.7;}
         else if (golongan==2 && masakerja >=21 && masakerja <=30){
              bonus=gajipokok * 0.8;}
         else if (golongan==3 && masakerja >=0 && masakerja <=10){
              bonus=gajipokok * 0.7;}
         else if (golongan==3 && masakerja >=11 && masakerja <=20){
              bonus=gajipokok * 0.8;}
         else if (golongan==3 && masakerja >=21 && masakerja <=30){
              bonus=gajipokok * 0.9;}
         else if  (golongan==4 && masakerja >=0 && masakerja <=10){
              bonus=gajipokok * 0.8;}
         else if (golongan==4 && masakerja >=11 && masakerja <=20){
              bonus=gajipokok * 0.9;}
         else if (golongan==4 && masakerja >=21 && masakerja <=30){
              bonus=gajipokok * 0.1;}
          
          System.out.println(" Bonus gaji anda adalah Rp"+ bonus);
     }
    
}

    

