

package praktikumdowhile;

import java.util.Scanner;


public class Praktikumdowhile {

   
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       int bi=0,Ba=0,u=0, jum;
       double g;
       int berat=1;
        System.out.println(" jumlah mangga");
        jum=input.nextInt();
        
        do {
            System.out.print("berat mangga "+berat+ " :");
            berat++;
            g=input.nextDouble();
            
            if (g<500){
                System.out.println("Biasa");
                bi++;
            }else if (g >=500 && g<=750){
                System.out.println(" Bagus");
               Ba++;
           } else if ( g >=750)
                System.out.println(" Unggul");
            u++;
    }while (g <=800);
        System.out.println(" mangga yang akan ditimbang");
        System.out.println(" diekspor "+u+" buah");
        System.out.println(" dalam negeri "+Ba+" buah");
        System.out.println(" dibikin juice "+bi+" buah");
}
}
