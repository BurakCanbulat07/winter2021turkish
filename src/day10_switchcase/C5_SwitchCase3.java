package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {
public static void main(String[] args) {
	// kullanicidan hangi gunde oldugumuzu isteyin (yazi)
	//girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Hangi gundeyiz");
	String gun = scan.next().toLowerCase();
	
	switch (gun) {
	case "pazartesi" :
		System.out.println("hafta ici");
		break;
	case "sali" :
		System.out.println("hafta ici");
		break;
	case "carsamba" :
		System.out.println("hafta ici");
		break;
	case "persembe" :
		System.out.println("hafta ici");
		break;
	case "cuma" :
		System.out.println("hafta ici");
		break;
	}
	switch (gun) {
	case "cumartesi" :
		System.out.println("hafta sonu");
		break;
	case "pazar":
System.out.println("hafta sonu");
	default:
	}
	
	
	//kisayol
	System.out.println("kisayol ile yapilan=");
	
	switch (gun) {
	case "pazartesi" :
	case "sali" :
	case "carsamba" :
	case "persembe" :
	case "cuma" :
		System.out.println("hafta ici");
		break;
	}
	switch (gun) {
	case "cumartesi" :
	case "pazar" :
System.out.println("hafta sonu");
	default:
	}
	scan.close();
}
}
