package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {
	public static void main(String[] args) {
		//kullanicidan bir cumle ve aramak istedigi bir string isteyin
		//cumle string i iceryorsa "basarili" , degilse "basarisiz" yazdirin
		
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Lutfen bir cumle giriniz efenim");
		String cumle= scan.nextLine().toLowerCase();//java guzel
		System.out.println("Ne aramak istersin");
		String aranan= scan.nextLine().toLowerCase();//java
		
		System.out.println(cumle.contains(aranan) ? "Var" : "Yok oyle kelime");
		*/
		
		//___________________________________________________________________________________________________
		System.out.println("Lutfen email giriniz efenim");
		String email= scan.next().toLowerCase();
		
		String sonuc= email.contains("@gmail.com") ? "mailiniz kaydedildi" : "sallama";
		System.out.println(sonuc);
		
		int sondami =email.indexOf("@gmail.com", email.length()-10);
		
		if (email.contains("@gmail.com")&&sondami !=-1) {
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("Sallama dedik");
		}
		scan.close();
	}

}
