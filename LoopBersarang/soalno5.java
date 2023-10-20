

package LoopBersarang;


public class soalno5 {
      public static void main(String[] args) {
          int kolom=1;
          for (int  baris = 1; baris <=10; baris ++){
              for ( kolom=1;kolom<=10;kolom++)
                  System.out.printf("%5d ",baris *kolom);
              System.out.println();
          }
      }
    
}
