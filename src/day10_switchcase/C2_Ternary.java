package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {
	public static void main(String[] args) {
		//bir sayi alin
		//cif ise cift yazdirin
		//degilse karesini alin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayi girin");
		int sayi = scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);
		scan.close();
	}

}
