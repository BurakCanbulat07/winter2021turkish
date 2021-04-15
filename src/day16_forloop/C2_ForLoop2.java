package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen 2 tamsayi giriniz");
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	
	if (sayi1>sayi2) {
		for (int x = sayi1; x>=sayi2; x--) {
			System.out.print(x+" ");
		}} else if (sayi1<sayi2) {
			for (int y = sayi1; y<=sayi2; y++) {
				System.out.print(y+" ");
			}
		} else {
		System.out.println("sayilar esit");
	}
	scan.close();
}
}
