

package praktikumwhile;

import java.util.Scanner;

public class konversiSuhu2 {
     public static void main(String[] args) {
                 Scanner inp = new Scanner(System.in);

        int dataSuhu = 1, dataCelsius;

        int reamuhr = 0, fahrenheit = 0;


        while (dataSuhu <= 10) {
            
            System.out.print("Masukan suhu ke  " + dataSuhu + " :");
           
            dataCelsius = inp.nextInt();
           
            dataSuhu++;
            
            reamuhr = dataCelsius * 4 / 5;
           
            fahrenheit = dataCelsius * 9 / 5 + 32;
           
            System.out.print("Reamuhr : " + reamuhr);
           
            System.out.println();
            
            System.out.println("Fahrenheit : " + fahrenheit);
            
            dataCelsius++;

        }

    }

}

     
    

