/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumwhile;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class dataDeviasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bilangan, max, min, rentang = 0;
        float rata2 ;
        float jumlah ;
        int i;
        float data;
        float kuadrat , variansi = 0;
        double deviasi = 0;
        i = 1;
        jumlah = 0;
        bilangan = 0;
        kuadrat = 1;
        max = 0;
        min = 0;
        System.out.print(" masukkan banyaknya data :");
        data = input.nextInt();
        while (i <= data) {
            System.out.print("masukkan data ke" + i + ":");
            bilangan = input.nextInt();
            jumlah +=bilangan;          
            kuadrat+=bilangan*bilangan;
            i++;
            if (i == 1) {
                max = bilangan;
            } else if (bilangan > max) {
                max = bilangan;
            }
            if (i == 2) {
                min = bilangan;
            } else if (bilangan < min) {
                min = bilangan;
                
            }

        }
        rentang = max - min;
        rata2 = jumlah / data;
        variansi= ((kuadrat-data)*(rata2*rata2))/data;
        deviasi= Math.sqrt (variansi);

        System.out.println("data terbesar =" + max);
        System.out.println("data terkecil  =" + min);
        System.out.println(" rentang data=" + rentang);
        System.out.println(" rata-rata =" + rata2);
        System.out.println(" variansi =" + variansi);
        System.out.println(" deviasi standard =" + deviasi);

    }
}
