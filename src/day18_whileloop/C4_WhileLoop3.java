package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {
public static void main(String[] args) {
	//Soru 4) Kullanicidan baslangic ve bitis haflerini alin
	//ve baslangic harfinden baslayip bitis harfinde biten tum 
	//harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Baslangic harfini girin");
	char harf1=scan.next().toUpperCase().charAt(0);
	System.out.println("Bitis harfini girin");
	char harf2=scan.next().toUpperCase().charAt(0);
	
	char i=harf1;
	while(harf2>=i) {
		System.out.print(i+" ");
		i++;
	}
	scan.close();
}
}
