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
public class HariBulan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner inp = new Scanner(System.in);
        int bulan, jumHari;
       jumHari = inp.nextInt();
       String bulanString;
        
        switch (jumHari) {
            
           case 1:
                bulanString = "Januari";
                jumHari = 31;
                break;
            case 2:
                bulanString = "Februari";
                jumHari = 28;
                break;
            case 3:
                bulanString = "Maret";
                jumHari = 31;
                break;
            case 4:
                bulanString = "April";
                jumHari = 30;
               
                break;
                
            
            case 5:
                bulanString = "Mei";
                jumHari = 31;
               
                break;
                
            
            case 6:
                bulanString = "Juni";
                jumHari = 30;
               
                break;
                
           
            case 7:
                bulanString = "Juli";
                jumHari = 31;
              
                break;
                
            
            case 8:
                bulanString = "Agutus";
                jumHari = 31;
               
                break;
                
            
            case 9:
                bulanString = "September";
                jumHari = 30;
                
                break;
                
            
            case 10:
                bulanString = "Oktober";
                jumHari = 31;
                
                break;
                
           
            case 11:
                bulanString = "November";
                jumHari = 30;
                
                break;
                
            
            case 12:
                bulanString = "Desember";
                jumHari = 31;
                
                break;
                
           
            default:
                System.out.println("Invalid Month");
               
             break;
             
        }
       
          System.out.println("jumlah Hari dari bulan : "+jumHari);
    }

    }
    

