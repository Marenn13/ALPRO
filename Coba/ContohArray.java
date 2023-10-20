
package Coba;

import java.util.Scanner;

public class ContohArray {
    public static void main(String[] args) {
        Scanner A = new Scanner (System.in);
    int []data= new int [10];
     double jumData = 1;
        System.out.println("masukkan 10 data :");
      
        for ( int i=0; i < 10; i++){
            System.out.print(" data ke- "+i+ ":");
            data[i]=A.nextInt();
            jumData= jumData + data[i];
        }
        System.out.println(" Cetak isi Array dari AKHIR ke AWAL");
        for (int i=0; i<10; i++)
            System.out.print (data [9-i]);
        System.out.println();
        
        double rata= jumData/10;
        System.out.println(" rata-rata dari data tersebut adalah = "+ rata);
    
}
}
