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
public class BB {
      public static void main(String[] args) {
         double Tb,BB,beratIdeal;
         
         Scanner inp=new Scanner (System.in);
         
         System.out.print(" Masukkan tinggi badan :");
         Tb=inp.nextDouble();
         System.out.print("masukkan berat badan :");
         BB=inp.nextDouble();
         beratIdeal=Tb-BB;
         if ( beratIdeal >=90 && beratIdeal<=110){
             System.out.println("berat ideal");
         }else if ( beratIdeal <90){
             System.out.println("terlalu gemuk");
         }else if (beratIdeal >110){
             System.out.println("terlalu kurus ");
         }
     }
    
    
}
