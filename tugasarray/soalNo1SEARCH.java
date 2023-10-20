

package tugasarray;

import java.util.Scanner;


public class soalNo1SEARCH {

    
    public static void main(String[] args) {
       Scanner inp=new Scanner (System.in);
        System.out.println(" PROGRAM JAVA PENCARIAN ARRAY");
        System.out.println();
        
        searchelemen ();
//        inputData ();
        
       
        }

    private static int[] searchelemen() {
         Scanner inp=new Scanner (System.in);
        
       int [] arr = new int [10];
       int jum,isi;
        System.out.print(" masukkan jumlah array =");
        jum=inp.nextInt();
        System.out.println("input"+ jum+ "angka");
        for (int i=1; i<= jum; i++) {
            arr[i]=inp.nextInt();
            System.out.println();
         } System.out.print(" angka yang dicari =");
          isi=inp.nextInt();
          for (int i=1; i <=jum;i++){
              if (arr[i]==isi ){
                  System.out.println("angka yang ditemukan indeks ke- "+i);
                  return arr;
              }
         }
        return null;
    
    }
    }
    
    


   
        
