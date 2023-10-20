

package praktikumperulanganfor;

import java.util.Scanner;


public class soalNo5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        
        double jumKuadrat=1;
        double jumAkar=1;
        double jumData=1;
        
        System.out.println("==== MENGHITUNG BANYAK DATA ===");
        System.out.print("masukkan banyak data = ");
        int data=inp.nextInt();
        for (int i=1; i<=data; i++){
            System.out.print(" Data ke "+i+ " = ");
            int md=inp.nextInt();
            jumKuadrat+= data*data;
            jumAkar= Math.sqrt(md);
            jumData+= 1.0/md;
        }System.out.println(" jumlah kuadrat data = "+jumKuadrat);
        System.out.println(" jumlah akar data = "+jumAkar);
        System.out.println(" jumlah 1/ data ="+jumData );
    }
    
}
