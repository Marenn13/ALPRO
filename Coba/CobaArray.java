
package Coba;

import java.util.Scanner;

public class CobaArray {
     public static void main(String[] args) {
        // TODO code application logic here
        int []nilai=new int [5];
        Scanner key=new Scanner (System.in);
        
        System.out.println(" Masukkan 5 angka bilangan bulat :");
        
        for ( int i=0;i <5;i++)nilai [i]=key.nextInt();
        System.out.println();
        System.out.println(" Cetak isi Array dari AKHIR ke AWAL");
        
        
        for (int i=0; i<5; i++)
            System.out.println(nilai [4-i]);
     }
    
}
