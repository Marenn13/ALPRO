

package praktikumwhile;

import java.util.Scanner;


public class konversiSuhu {
        public static void main(String[] args) {
       
       Scanner inp = new Scanner(System.in);
      
       int fahrenheit,reamur,suhuMin,suhuMaks, selisih;
       
        System.out.println("Tabel Konversi Celsius ke Reamuhr dan Frahrenheit");
        
        System.out.print("Nilai Suhu Minimum : ");
       
        suhuMin=inp.nextInt();
        
        System.out.print("Nilai Suhu Maksimum : ");
        
        suhuMaks=inp.nextInt();
       
        System.out.print("Nilai Selisih Kenaikan : ");
        
        selisih=inp.nextInt();
       
        System.out.println("Celsius/t/t/tReamhur/t/t/tFahenheit");
       
        while (suhuMin<=suhuMaks){
           
            reamur = suhuMin * 4/5;
           
            fahrenheit= suhuMin * 9/5 + 32;
            System.out.print(suhuMin+"/t/t/t");
            System.out.print(reamur+"/t/t/t");
            System.out.println(fahrenheit);
            
            suhuMin = suhuMin+selisih;
            
        }
    }
    
}

    

