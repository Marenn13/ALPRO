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
public class Soal2 {
    public static void main(String[] args) {
         double AB, AC, BC;
         double absisA, ordinatA;
         double absisB, ordinatB;
          double absisC, ordinatC;
          
          Scanner input= new Scanner (System.in);
          System.out.println("Masukkan absis A :");
          absisA=input.nextDouble ();
          System.out.println("Masukkan ordinat A :");
          ordinatA=input.nextDouble();
          System.out.println("Masukkan absis B :");
          absisB=input.nextDouble ();
          System.out.println("Masukkan ordinat B :");
          ordinatB=input.nextDouble();
          System.out.println("Masukkan absis C :");
          absisC=input.nextDouble ();
          System.out.println("Masukkan ordinat C :");
          ordinatC=input.nextDouble();
          
          AB= Math.sqrt (Math.pow (absisB-absisA,2))+ (Math.pow (ordinatB-ordinatA, 2));
          AC= Math.sqrt (Math.pow (absisC-absisA,2))+ (Math.pow (ordinatC-ordinatA, 2));
          BC= Math.sqrt (Math.pow (absisC-absisB,2))+ (Math.pow (ordinatC-ordinatB, 2));
          
          if (AB== BC && BC == AC && AB== AC){
              System.out.println(" Segitiga Sama Sisi");
          }else if (AB == AC || BC==AB || BC==AC){
              System.out.println(" segitiga sama kaki");
          }else if (Math.pow (AB,2)== Math.pow (BC,2)+Math.pow(AC,2)){
              System.out.println("segitiga siku-siku");
              
          }else {
              System.out.println("segitiga sembarang");
          }
         }
    
}
     

    

