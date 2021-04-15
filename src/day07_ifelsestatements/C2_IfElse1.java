package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {
public static void main(String[] args) {
	
	//kullanicidan dikdortgenin kenar uzunluklarini alin
	//uzunluklari esit ise kar' degilse kare degil yazin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir kenar uzunlugu girin");
	double kenar1=scan.nextDouble();
	
	System.out.println("Lutfen bir kenar uzunlugu daha girin");
	double kenar2=scan.nextDouble();
	
	if (kenar1==kenar2) {
		System.out.println("Kare");
	} else {
		System.out.println("Kare degil");
	}
	
	if (kenar1<=0||kenar2 <=0) {
		System.out.println("Gecersiz kenar uzunlugu");
	}
	scan.close();
}
}
