package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {
public static void main(String[] args) {
	// soru 1) kullanicidan iki sayi alin ve buyuk olani yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("2 sayi giriniz");
	double sayi1 = scan.nextDouble();
	double sayi2 = scan.nextDouble();
	
	double sonuc= sayi1 > sayi2 ? sayi1 :sayi2;
	System.out.println(sonuc);
	
	scan.close();
}
}
