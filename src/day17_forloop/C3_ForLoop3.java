package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
    System.out.println("Lutfen 35'den kucuk pozitif bir tamsayi giriniz");
    int sayi=scan.nextInt();
    
    if (sayi>35||sayi<0) {
		System.out.println("Gecersiz sayi");
	} else {
		faktoryelBul(sayi);
	}
    scan.close();
}

private static void faktoryelBul(int sayi) {
	int faktoryel=1;
	for (int i = 1; i<=sayi; i++ ) {
		faktoryel*=i;
	}
	System.out.println(faktoryel);
}

}
