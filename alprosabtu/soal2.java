

package alprosabtu;

import java.util.Scanner;


public class soal2 {
    public static void main(String[] args) {
        int []nilai= new int [5];
        Scanner input=new Scanner (System.in);
        System.out.println("masukkan 5 bilangan bulat");
        for (int i=0; i<5; i++){
            System.out.print("Nilai: ");
            nilai[i]= input.nextInt();
        }
        System.out.println( "bilangan berurut");
        System.out.println("cetak nilai");
        for (int i=0; i<5;i++){
            System.out.println("Nilai:"+nilai[i]);
        }System.out.println(" bilangan tak berurut");
        
        
        
    
}
}

