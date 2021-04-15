package day07_ifelsestatements;

import java.util.Scanner;


public class C1_IfStatement {
	public static void main(String[] args) {
		//kullanicidan bir tamsayi isteyin
		//sayi pozitif ise "sayi pozitif" yazdirin
		//sayi 100 den kucukse "kucuk sayi" yazdirin
		//sayi 1000 den buyukse "buyuk sayi" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayi pozitif");
		}
		
		if (sayi<0) {
			System.out.println("Sayi negatif");
		}
		
		if (sayi>1000) {
			System.out.println("Sayi 1000 den buyuk");
		}
		
		if (sayi<100) {
			System.out.println("Sayi 100 den kucuk");
		}
		
		if (sayi==1000) {
			System.out.println("Sayi 1000 den buyuk degil. sayi 1000 ;)");
		}
		
		if (sayi==100) {
			System.out.println("sayi 100 den kucuk degil. sayi 100 ;)");
		}
		
		if (sayi==0) {
			System.out.println("Sayi pozitif ya da negatif degil. sayi 0");
		}
		
		scan.close();
		
	}

}
