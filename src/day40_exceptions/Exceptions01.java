package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {
	
	public static void main(String[] args) {
		//kullanicidan yasini girmesini isteyin
		//Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek
		//sekilde yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas1=scan.nextInt();
		
		if (yas1>=0) {
			System.out.println("Girdiginiz yas: "+yas1);
		}else {
			throw new IllegalArgumentException();
		}
		System.out.println("Kod bloke olmamis");
		
		//Java ya bir exception throw ettirmek icin "throw" ve "new" keyword'leri kullaniriz
		
		//bu sekilde yazdirdigimida Java exception throw eder ama
		//kodumuz bloke olur 
		//bunu engellemek icin kodu try catch ile surround yapabiliriz
		System.out.println("Lutfen yasinizi giriniz");
		int yas2=scan.nextInt();
		
		try {
		if (yas2>=0) {
			System.out.println("Girdiginiz yas: "+yas2);
		}else {
			throw new IllegalArgumentException();
		}
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("Kod bloke olmamis");
		
	}

}
