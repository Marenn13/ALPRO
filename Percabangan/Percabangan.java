
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class Percabangan {
     public static void main(String[] args) {
        float bil1,bil2,bil3;
        
        Scanner input=new Scanner (System.in);
        System.out.print("bilangan ke- 1 :");
        bil1= input.nextFloat();
        System.out.print(" bilangan ke-2");
        bil2= input.nextFloat();
        System.out.print("bilangan ke-3 ");
        bil3= input.nextFloat();
        // mengurutkan dari kecil ke besar
        System.out.println(" urutan 3 bilangan diatas dari kebesar adalah ");
        if (bil1 <bil2 && bil2< bil3){
            System.out.println(bil1 +""+bil2 +""+bil3);
        }else if (bil2<bil1 && bil1 < bil3){
            System.out.println(bil2 +""+bil1+ ""+bil3);
        }else if ( bil3 < bil1 && bil1<bil2){
            System.out.println(bil3 +""+bil1+""+bil2);
        }else if (bil2<bil3 && bil3 <bil1){
            System.out.println(bil2+""+bil3+""+bil1);
        }else if (bil1 < bil3 && bil3 < bil2){
            System.out.println(bil1+""+bil3+""+bil2);
        }
    }
    
}

    

