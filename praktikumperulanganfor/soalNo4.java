

package praktikumperulanganfor;

import java.util.Scanner;


public class soalNo4 {
     public static void main(String[] args) {
         int jumlah,rs=0, total, disusun;
         double rp=0, nilai=0;
         
         Scanner inp= new Scanner (System.in);
         
         System.out.println(" == Program Menghitung Resistor==");
         System.out.println("1. seri");
         System.out.println(" 2. paralel ");
         System.out.print(" pilih tahanan resistor =");
         disusun=inp.nextInt();
         System.out.println("masukkan jumlah =");
         total=inp.nextInt();
         
         switch (disusun){
             case 1: for (jumlah=1;jumlah <= total; jumlah++){
                 System.out.print(" rangkaian ke ="+jumlah+ " :");
                 nilai = nilai + inp.nextInt();
             }System.out.println(nilai);
                 break;
                case 2: for (jumlah=1;jumlah <= total; jumlah++){
                 System.out.print(" rangkaian ke ="+jumlah+ " :");
                 nilai = nilai + (1/ inp.nextInt()); 
         }System.out.println(" "+1/nilai);
         
                
}
}
}