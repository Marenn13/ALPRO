/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class Praktik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Gaji Karyawan Perusahan DIY");
        System.out.print("Jumlah Karyawan: ");
        int a = input.nextInt();
        String[] nama = new String[a];
        String[] alamat = new String[a];
        int[] thnMasuk = new int[a];
        double[] gajiPok = new double[a];
        double[] tunjangan = new double[a];
        double[] gajiTot = new double[a];
        int[] masaKerja = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nama: ");
            nama[i] = input.next();
            System.out.print("Alamat: ");
            alamat[i] = input.next();
            System.out.print("Tahun Masuk: ");
            thnMasuk[i] = input.nextInt();
            System.out.print("Gaji Pokok: ");
            gajiPok[i] = input.nextInt();

        }
        System.out.printf("\nNo. \t Nama  \tAlamat  \tTahun Masuk   \tGaji Pokok     \t\tTunjanggan    \t\tGaji Total\n");
        for (int j = 0; j < nama.length; j++) {
            masaKerja[j] = masKer(thnMasuk[j]);
            if (masaKerja[j] < 5) {
                tunjangan[j] = 0.25 * gajiPok[j];
                gajiTot[j] = gajiPok[j] + tunjangan[j];
            } else if (masaKerja[j] >= 5 && masaKerja[j] < 10) {
                tunjangan[j] = 0.5 * gajiPok[j];
                gajiTot[j] = gajiPok[j] + tunjangan[j];
            } else if (masaKerja[j] >= 10 && masaKerja[j] < 20) {
                tunjangan[j] = 0.75 * gajiPok[j];
                gajiTot[j] = gajiPok[j] + tunjangan[j];
            } else if (masaKerja[j] >= 20) {
                tunjangan[j] = 1 * gajiPok[j];
                gajiTot[j] = gajiPok[j] + tunjangan[j];
            }
            System.out.printf("%d  \t%s  \t%s  \t%d \t\t%f \t\t%f \t\t%f \n", (j + 1),nama[j],alamat[j],thnMasuk[j],gajiPok[j],tunjangan[j],gajiTot[j]);
           
        }

    }
    static int masKer(int thnMasuk) {
        final int tahunSekarang = 2023;
        return tahunSekarang - thnMasuk;
    }
}


