package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {
	public static void main(String[] args) {
		//kullanicidan gun isminin ilk harfini isteyin ve
		//harfe uygun olan gun isimlerini yazdirin
		//c --> cuma'cumartesi
		//s -->sali
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf == 'P') {
			System.out.println("Pazartesi,Persembe,Pazar");
		}
		
		if (ilkHarf == 'S') {
			System.out.println("Sali");
		}
		
		if (ilkHarf=='C') {
			System.out.println("Carsamba,Cuma,Cumartesi");
		}
		
		if (ilkHarf!='P'&& ilkHarf!= 'S'&& ilkHarf!= 'C') {
			System.out.println("Bu harf ile bir gun yok");
		}
		
		scan.close();
				
				
	}

}
