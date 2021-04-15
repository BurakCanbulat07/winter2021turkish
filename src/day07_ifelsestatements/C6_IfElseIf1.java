package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {
	public static void main(String[] args) {
		//kullanicidan 100 uzerinden notunu isteyin
		//50 den kucukse D 50 60 arasiysa C 60 80 arasiysa B 80 in uzerindeyse A
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 100 uzerinden notunuzu giriniz");
		double not=scan.nextDouble();
		
		if (not<0||not>100) { //istenmeyen durum
			System.out.println("Not gecerli degil -,-");
		} else if (not<50) {
			System.out.println("Sonuc: D | :,(");
			
		} else if (not<60) {
			System.out.println("Sonuc: C | :( ");
		} else if (not<80) {
			System.out.println("Sonuc: B | :)");
		} else if (not>=80) {
			System.out.println("Sonuc: A | ^-^");
		}
		scan.close();

		}
	}


