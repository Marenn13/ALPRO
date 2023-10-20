package Looping;

import java.util.Scanner;

public class soalNo09 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int usia, dU, p = 0, pilih, jum = 0;
        double dev = 0, var, jumK = 0, rerata = 0;
        int a=0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e=0;
        

        do {
            System.out.println(" Menu ");
            System.out.println("1. Masukan Data Usia");
            System.out.println("2. Rata-rata ");
            System.out.println("3. Deviasi Standar ");
            System.out.println("4. Diagram Batang ");
            System.out.println("5. Keluar");
            System.out.print(" Menu yang dipilih : ");
            pilih = inp.nextInt();
            switch (pilih) {

                case 1:
                    System.out.print(" Jumlah Penduduk : ");
                    p = inp.nextInt();
                    for (dU = 1; dU <= p; dU++) {
                        do {
                            System.out.print("Usia Warga  " + dU + " : ");
                            usia = inp.nextInt();
                        } while (!(usia >= 0 && usia < 100));
                        if (usia >= 0 && usia <= 20) {
                            a++;

                        } else if (usia >= 21 && usia < 40) {
                            b++;

                        } else if (usia >= 41 && usia <= 60) {
                            c++;

                        } else if (usia >= 61 && usia <= 80) {
                            d++;

                        } else if (usia >= 81 && usia <= 100) {
                            e++;
                        }
                        jum = jum + usia;
                        jumK = jumK + (Math.pow(usia, 2));
                    }
                    break;
                case 2:
                    rerata = jum / p;
                    System.out.println(" Rata-rata " + rerata);
                    break;
                case 3:
                    var = (jumK - jum * (Math.pow(rerata, 2)) / jum);
                    dev = (Math.sqrt(var));
                    System.out.print(" Deviasi Standar " + dev);
                    break;
                case 4:
                    System.out.println(" Distribusi usia " + p + " dari Penduduk");

                    System.out.println();
                    System.out.print(" 0-20 \t :");
                    for (dU = 1; dU <= a; dU++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.print(" 21-40 \t :");
                    for (dU = 1; dU <= b; dU++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.print("41-60 \t :");
                    for (dU = 1; dU <= c; dU++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.print("61-80 \t :");
                    for (dU = 1; dU <= d; dU++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.print("81-100 \t :");
                    for (dU = 1; dU <= e; dU++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 5 :
                    System.out.println(" KELUARRRRR ");

            }

        } while (pilih !=5);

    }
}
