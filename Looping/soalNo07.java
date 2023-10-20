

package Looping;

import java.util.Scanner;


public class soalNo07 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int usia,dU,p;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        
        System.out.print(" Masukkan jumlah penduduk = ");
        p=input.nextInt();
        System.out.println();
        for (dU=1; dU<=p; dU++){
            
                System.out.print("Usia Warga =  "+dU+ " : " );
                usia=input.nextInt();
           
            if (usia >=0 && usia <=20){
                a++;
               
                }
            else if (usia >=21 && usia <40){
                b++;
            
            } else if (usia >=41 && usia <=60){
                c++;
                
            } else if (usia >= 61 && usia <= 80){
                d++;
                
            }else if (usia >=81 && usia <=100){
                e++;}       
        }
         System.out.println(" Distribusi usia " + dU+ " dari Penduduk");
        
        System.out.println();
        System.out.print(" 0-20 \t :");
        for (dU=1; dU<=a;dU++){
            System.out.print("*");}
        System.out.println();
        System.out.print(" 21-40 \t :");
        for (dU=1; dU<=b;dU++){
            System.out.print("*");}
        System.out.println();
        System.out.print("41-60 \t :");
        for (dU=1; dU<=c;dU++){
            System.out.print("*");}
        System.out.println();
        System.out.print("61-80 \t :");
        for (dU=1; dU<=d;dU++){
            System.out.print("*");}
        System.out.println();
        System.out.print("81-100 \t :");
        for (dU=1; dU<=e;dU++){
            System.out.print("*");}
        System.out.println();
        
      
            
        
    } 
}
