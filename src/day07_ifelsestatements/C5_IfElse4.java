package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {
	public static void main(String[] args) {
		// kullanicidan ucgenin kenar uzunluklarini alin
		//uc kenar esitse eskenar yazdirin
		//yoksa eskenar degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ucgenin birinci kenarini girin");
		double kenar1=scan.nextDouble();
		System.out.println("Ucgenin ikinci kenarini girin");
		double kenar2=scan.nextDouble();
		System.out.println("Ucgenin ucuncu kenarini girin");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2&&kenar2==kenar3) {
			System.out.println("Eskenar ucgen");
		} else {
System.out.println("Eskenar ucgen degil");
		}
		
		if (kenar1==kenar2||kenar2==kenar3||kenar3==kenar1) {
			System.out.println("ikizkenar ucgen");
		}
		
		if (kenar1!=kenar2&&kenar2!=kenar3) {
			System.out.println("Cesitkenar ucgen");
		}
		scan.close();
	}

}
