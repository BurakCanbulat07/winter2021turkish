package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {
/*
 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
  - Sifre kucuk harf icermelidir
  - Sifre buyuk harf icermelidir
  - Sifre ozel karakter icermelidir
  - Sifre en az 8 karakter olmalidir.
 */
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        String buyuk="yok";
	        
	        int karakter=0;
	        String cumle="";
		do { 
			System.out.println("Sifre giriniz");
	        cumle= scan.nextLine();

			if (buyukHarf(cumle)==1) {
			buyuk="var";
			}else {
				buyuk="yok";
			}
	        System.out.println("Cumlede kucuk harf "+kucukHarf(cumle));
	        System.out.println("Cumlede buyuk harf "+buyuk);
	        System.out.println("Cumlede ozel karakter "+ozelKarakter(cumle));
	        if (cumle.length()<8) {
				System.out.println("Sifre en az 8 karakterden olusmalidir");
			} else {
				System.out.println("Sifre 8 karakterden uzun");
				karakter=1;
			}
	        }while(kucukHarf(cumle)=="yok"||buyuk=="yok"||ozelKarakter(cumle)=="yok"||karakter==0);
		System.out.println("Sifre kabul edildi");
	scan.close();}
public static String kucukHarf (String cumle) {
	 String flag="yok";
     
     int index=0;
     
     while(index<cumle.length()) {
         
         if (cumle.charAt(index)>='a' && cumle.charAt(index)<='Z' ) { 
             flag="var";
         }
         index++;
     }
	return flag;
}
public static int buyukHarf (String cumle) {

	 int flag=0;
    
    int index=0;
    
    while(index<cumle.length()) {
        
        if (cumle.charAt(index)>='A' && cumle.charAt(index)<='Z' ) { 
           flag= 1;
        }
        index++;
    }
	return flag;
}
public static String ozelKarakter(String cumle) {

	 String flag="yok";
   
   int index=0;
   
   while(index<cumle.length()) {
       
       if (cumle.charAt(index)>=' ' && cumle.charAt(index)<='/' ) { 
          flag= "var";
       }
       index++;
   }
	
	return flag;
}

}