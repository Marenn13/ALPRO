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
public class Zodiak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


                Scanner input = new Scanner(System.in);
        
        System.out.print("Nama : ");

        String nama = input.nextLine();
        
        System.out.print("Alamat : ");

        String alamat = input.nextLine();
         
        System.out.print("Tanggal lahir  :");

        int tanggal = input.nextInt();
      
        System.out.print("Bulan lahir :");

        String bulan = input.next();

        
        switch (bulan) {
            
            case "Januari":

                if (tanggal >= 1 && tanggal <= 19) {
             
                    System.out.println("Anda berbintang : Capricornus");
             
                    System.out.println("Sifat Anda : Bertanggung jawab dan realistis ");

                } else if (tanggal >= 20 && tanggal <= 31) {
              
                    System.out.println("Anda berbintang : Aquarius");
              
                    System.out.println("Sifat Anda : Energik dan suka kebebasan ");
                }
             
                 break;

            case "Februari":

                if (tanggal >= 1 && tanggal <= 18) {
                    
                    System.out.println("Anda berbintang : Aquarius");
                   
                     System.out.println("Sifat Anda : Energik dan suka kebebasan ");
                     
                } else if (tanggal >= 19 && tanggal <= 29) {
                   
                    System.out.println("Anda berbintang : Pisces");
                   
                     System.out.println("Sifat Anda : Lembut dan bijaksana ");
                }
               
                break;

            case "Maret":

                if (tanggal >= 1 && tanggal <= 20) {
                    
                    System.out.println("Anda berbintang :  Pisces");
                   
                     System.out.println("Sifat Anda : Lembut dan bijaksana ");

                } else if (tanggal >= 21 && tanggal <= 31) {
                    
                    System.out.println("Anda berbintang :Aries");
                     
                   System.out.println("Sifat Anda : Optimis dan jujur ");
                }
               
                break;
             
            case "April":

                if (tanggal >= 1 && tanggal <= 19) {
                     
                    System.out.println(" Anda berbintang :Aries");
                    
                     System.out.println("Sifat Anda : Optimis dan jujur ");
                    
                } else if (tanggal >= 20 && tanggal <= 30) {
                   
                    System.out.println("Anda berbintang : Taurus");
                   
                     System.out.println("Sifat Anda : Sabar dan posesif ");   
                }
               
                break;
               
            case "Mei":
                 
                if (tanggal >= 1 && tanggal <= 19) {
                     
                    System.out.println("Anda berbintang : Taurus");
                   
                    System.out.println("Sifat Anda : Sabar dan posesif "); 
                
                } else if (tanggal >= 21 && tanggal <= 31) {
                   
                    System.out.println("Anda berbintang : Gemini");
                   
                    System.out.println("Sifat Anda : Mudah bergaul dan gugup");
                }
               
                break;
                
           
            case "Juni":

                if (tanggal >= 1 && tanggal <= 20) {
                    
                    System.out.println("Anda berbintang : Gemini");
                   
                     System.out.println("Sifat Anda : Mudah bergaul dan gugup");
                      
                } else if (tanggal >= 21 && tanggal <= 30) {
                   
                    System.out.println("Anda berbintang : Cancer");
                   
                    System.out.println("Sifat Anda : Setia dan manupulatif");
                }
               
                break;
           
            case "Juli":
               
                if (tanggal >= 1 && tanggal <= 22) {
                    
                    System.out.println("Anda berbintang : Cancer");
                   
                    System.out.println("Sifat Anda : Setia dan manupulatif ");
                    
                } else if (tanggal >= 23 && tanggal <= 31) {
                   
                    System.out.println("Anda berbintang : Leo");
                    
                     System.out.println("Sifat Anda : Kreatif dan sombong"); 
                }
              
                break;
                
            case "Agustus":
               
                if (tanggal >= 1 && tanggal <= 22) {
                    
                     System.out.println("Anda berbintang : Leo");
                    
                     System.out.println("Sifat Anda : Kreatif dan sombong");
                    
                } else if (tanggal >= 23 && tanggal <= 31) {
                   
                    System.out.println("Anda berbintang : Virgo");
                   
                     System.out.println("Sifat Anda : Loyal dan Kritis"); 
                }
                
                break;
                
            case "September":
              
                if (tanggal >= 1 && tanggal <= 22) {
                    
                   System.out.println("Anda berbintang : Virgo");
                   
                   System.out.println("Sifat Anda : Loyal dan Kritis"); 
                  
                } else if (tanggal >= 23 && tanggal <= 30) {
                   
                   System.out.println("Anda berbintang : Libra");
                  
                     System.out.println("Sifat Anda : Ramah dan tidak tegas"); 
                }
              
                break;
               
            case "Oktober":
                 
                if (tanggal >= 1 && tanggal <= 22) {
                     
                     System.out.println("Anda berbintang : Libra");
                    
                     System.out.println("Sifat Anda : Ramah dan tidak tegas");
                     
                } else if (tanggal >= 23 && tanggal <= 31) {
                   
                    System.out.println("Anda berbintang : Scorpio");
                   
                    System.out.println("Sifat Anda : Pemberani dan keras kepala");
                }
              
                break;
               
            case "November":
               
                if (tanggal >= 1 && tanggal <= 21) {
                   
                    System.out.println("Anda berbintang : Scorpio");
                    
                    System.out.println("Sifat Anda : Pemberani dan keras kepala");
                      
                } else if (tanggal >= 22 && tanggal <= 31) {
                   
                    System.out.println("Anda berbintang : Sagitarius");
                   
                    System.out.println("Sifat Anda : Kedermawanan dan idealistis");
                }
                
                break;
                
            case "Desember":
             
                if (tanggal >= 1 && tanggal <= 21) {
                
                  System.out.println("Anda berbintang : Sagitarius");
                 
                  System.out.println("Sifat Anda : Kedermawanan dan idealistis");
                
                } else if (tanggal >= 22 && tanggal <= 31) {
                    
                    System.out.println("Anda berbintang : Capricornus");
                    
                    System.out.println("Sifat Anda : Bertanggung jawab dan realistis ");
                }
                
                break;
                
            default:
               
                System.out.println("Salah masukan kode bulan");
               
                break;
        }
    }
}

    
    

