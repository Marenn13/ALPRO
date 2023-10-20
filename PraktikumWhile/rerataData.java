

package praktikumwhile;

import java.util.Scanner;


public class rerataData {
     public static void main(String[] args) {
         int datadiproses,data, jumlah=0, rerata=0, ulang=1;
        Scanner input= new Scanner (System.in);
        
        System.out.print("masukkan banyak data : ");
        datadiproses= input.nextInt();
       
        while(ulang <=datadiproses ){
            System.out.print("data ke "+ulang+" :");
            data=input.nextInt();
            jumlah=jumlah+data;
            ulang++;
        }rerata=jumlah /datadiproses;
        System.out.println("rata-rata adalah = "+rerata);
    
    
    
}}
