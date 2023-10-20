

package percabanganswitchcase;

import java.util.Scanner;


public class PercabanganSwitchcase {

    
    public static void main(String[] args) {
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
