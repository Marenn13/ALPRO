

package praktikumperulanganfor;

import java.util.Scanner;


public class soalNo7 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        double D, x1, x2;
        double a, b, c;
        double y, awal, akhir;
        System.out.print(" koefisien a = ");
        a=input.nextDouble();
        System.out.print(" koefisien b = ");
        b=input.nextDouble();
        System.out.print(" koefisien c = ");
        c=input.nextDouble();
        
         D = (b * b) - (4 * a * c);
         
         if ( D > 0){
             x1 = (-b + Math.sqrt(D)) / 2 * a;  
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            if ( x1 <x2){
                awal=x1;
                akhir=x1;
            }else  {
                awal=x2;
                akhir=x1;
                System.out.println(" Dari persamaan y = a * i * i + b * 1 + c;");
                System.out.println(" Akar-akarnya adalah : " +x1+ " dan " +x2);
                System.out.println(" Nilai y untuk beberapa x antara akar pertama dan kedua adalah : ");
                
                 for (double i = awal; i <= akhir; i = i+ 0.25){
                      y = a * i * i + b * 1 + c;
                      
                      System.out.println("---------------------");
                       System.out.println("X = " + i + " Y = " + y);
                 }
            }
         } else if ( D <= 0){
             x1= (-b + Math.sqrt (D))/ 2 * a ;
             System.out.println(" Memiliki 1 akar persamaan yakni = " +x1);
         } else {
             System.out.println(" Salah Masukkan ");
         }
    }
    
}
