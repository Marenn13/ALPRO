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
public class Kaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int harga, total, jumlah;
        String ukuranKaos;
        System.out.print("Ukuran Kaos : ");

        ukuranKaos = input.next();

        System.out.print("Jumlah Kaos : ");

        jumlah = input.nextInt();

        switch (ukuranKaos) {
            case "S":
                harga = 30000;
                total = jumlah * harga;
                System.out.println("Jumlah yang harus dibayar adalah : " + total);
                break;

            case "M":

                harga = 38000;

                total = jumlah * harga;

                System.out.println("Jumlah yang harus dibayar adalah : " + total);

                break;

            case "L":

                harga = 45000;

                total = jumlah * harga;

                System.out.println("Jumlah yang harus dibayar adalah : " + total);

                break;

            case "XL":

                harga = 50000;

                total = jumlah * harga;

                System.out.println("Jumlah yang harus dibayar adalah : " + total);

                break;

            case "XXL":

                harga = 60000;

                total = jumlah * harga;

                System.out.println("Jumlah yang harus dibayar adalah : " + total);

                break;

            default:

                System.out.println("Tidak Ada Ukuran");

                break;
        }

    }

}


    
