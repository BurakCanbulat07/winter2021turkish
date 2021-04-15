package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {
public static void main(String[] args) {
	
	//kullanicidan bir sayi alin ve 3 basamakli mi degilmi
	// kontrol edip yazdirin
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Bir sayi girin");
	int sayi = scan.nextInt();
	
	String sonuc = sayi>99&&sayi<1000 ? "uc basamakli" : "uc basamakli degil";
	System.out.println(sonuc);
	
	String sonuc2 = sayi<-99&&sayi>-1000 ? "uc basamakli" : "uc basamakli degil";
	System.out.println(sonuc2);
	scan.close();
}
}
