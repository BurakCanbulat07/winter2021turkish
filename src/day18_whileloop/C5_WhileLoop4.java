package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {
    public static void main(String[] args) {
        // Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tane  olduklarini ekranda yazdirin
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  bolenlerini bulmak için pozitif bir tamsayi giriniz");
        
        int sayi=scan.nextInt(); // 100 girmis olsun.
        
         int bolen=1;
         int count=0;
         
            while (bolen<=sayi) {
               
            if (sayi%bolen==0) {
                
                System.out.print(bolen+" ");
                count++; // boleni bulunca count u 1 artiriyoruz
            }
                bolen++;
           }
     System.out.println(" ");         
     System.out.println(sayi+ " sayisinin bolenleri : " + count + "  adettir.");
     System.out.println(" ");
     //bolenleri su sekilde yazdirin
     // 1 - 1 
     // 2 - 2
     // 3 - 4 ..  seklinde
     
      bolen=1;
      count=0;
     
        while (bolen<=sayi) {
           
        if (sayi%bolen==0) {
            
         count++; // boleni bulunca count u 1 artiriyoruz
            System.out.println(count + "- " + bolen);
        }
            bolen++;
       }
 
  scan.close();
    }
 
}