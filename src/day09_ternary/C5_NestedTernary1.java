package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2 kenar uzunlugu giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		String sonuc= sayi1==666||sayi2==666 ? "SeyTan KaREsI 0_-" : sayi1>0&&sayi2>0 ? (sayi1==sayi2? "kare" : "dikdortgen") : ("Duzgun yaz! Oyle kenar uzunlugu mu var");
	
		System.out.println(sonuc);
		
		scan.close();
	}

}
