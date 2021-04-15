package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {
/*
 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
 *  Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu
 *   sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
 *   Kullanici toplamak istedigi sayi adedini 4’den buyuk 
 *   girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
 *   2 den kucukse "en az iki sayi girmelisiniz" yazdirin.
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac sayi toplamak istersiniz");
		int adet=scan.nextInt();
		
		if (adet<2) {
			System.out.println("en az iki sayi girmelisiniz");
		}else if (adet==2) {
			System.out.println("Sayilari girin");
			ikiSayiTopla();
		}else if (adet==3) {
			System.out.println("Sayilari girin");
			ucSayiTopla();
		}else if (adet==4) {
			System.out.println("Sayilari girin");
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
		scan.close();
	}

	
public static void dortSayiTopla() {
	Scanner scan=new Scanner(System.in);
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	int sayi3=scan.nextInt();
	int sayi4=scan.nextInt();
System.out.println(sayi1+sayi2+sayi3+sayi4);
scan.close();
}
public static void ucSayiTopla() {
	Scanner scan=new Scanner(System.in);
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	int sayi3=scan.nextInt();
System.out.println(sayi1+sayi2+sayi3);
scan.close();
}
public static void ikiSayiTopla() {
	Scanner scan=new Scanner(System.in);
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
System.out.println(sayi1+sayi2);
scan.close();
	
}
}
