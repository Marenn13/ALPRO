

package praktikumtugas;

import java.util.Scanner;


public class gameTebakangka {

    
    public static void main(String[] args) {
         int a = (int)(Math.random() *100)+1;
        int tebak, batas=5;
        Scanner input=new Scanner (System.in);
        System.out.println("Game Tebak angka");
        System.out.println("tebak angka 1 sampai 100");
        
        do {
            System.out.print("masukkan angka tebakkan ANDA! =");
            tebak=input.nextInt();
            if (batas > 0){
                if (tebak==a){
                    System.out.println("SELAMAT TEBAKKAN ANDA BENAR  ");} 
                else if (tebak < a){
                    System.out.println(" TEBAKKAN ANDA TERLALU KECIL");}
                else if (tebak > a){
                    System.out.println("TEBAKKAN ANDA TERLALU BESAR");}
                System.out.println("ANDA MEMILIKI " + batas + " kesempatan");
                System.out.println("-------------------------------------");
                batas--;}
            else{
                System.out.println(" GAME OVER");
                System.out.println(" ANGKA YANG ANDA CARI ADALAH " +a);
                }
            }while (batas >=0);
        }
    }


