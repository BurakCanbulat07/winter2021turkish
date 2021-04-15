package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen pozitif tamsayi giriniz");
	int sayi = scan.nextInt();
	
	int toplam=0;
	
	for (int x = 1; x<=sayi; x++) {
		toplam+=x;}
	
	System.out.println("Toplam: "+toplam);
	scan.close();
}
}
