/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Switch;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner (System.in);
        short N;
        System.out.println(" masukkan sebuah bilangan ");
        N=sc.nextShort();
        switch (N){
            case 1 :
                System.out.println("satu");
                break;
            case 2 :
            case 4 :
            case 8 :
                System.out.println(" bilangan tersebut adalah 2,4,8");
                System.out.println(" yakni ");
        }
    }
    
}
   
