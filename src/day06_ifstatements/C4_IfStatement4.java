package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {
	public static void main(String[] args) {
		//kullanicidan gun ismini isteyin 
		//girilen gunu hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir gun giriniz");
		boolean sonuc=false;
		
		//eger strinlerde esitlik sorguluyorsak == kullanmamaliyiz
		//stringlerde esit olma durumunu sorgulamak icin equal()
		
		String gun  = scan.nextLine().toLowerCase();
		if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Girdiginiz gun hafta ici");
			sonuc=true;
		}
		
		if (gun.equals("cumartesi")||gun.equals("pazar")) {
			System.out.println("Girdiginiz gun hafta sonu");
			sonuc=true;
		}
		
		
		
		if (gun.equals("burak biyiklidir")) {
			System.out.println("Kendi suratina bakmalisin =)");
			sonuc=true;
		}
		
		if (sonuc!=true) {
			System.out.println("Lutfen gecerli bir gun giriniz");	
		}
		
		scan.close();
		
	}

}
