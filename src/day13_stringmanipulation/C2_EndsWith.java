package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {
	public static void main(String[] args) {
		
		String str="Javayla hayat ne guzel";
		System.out.println("zel le biter? :"+str.endsWith("zel"));
		System.out.println("ne guzel le biter? :"+str.endsWith("ne guzel"));
		System.out.println("zel  ile biter? : "+str.endsWith("zel "));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email giriniz efenim");
		String email= scan.next().toLowerCase();
		
		String sonuc= email.endsWith("@gmail.com") ? "mailiniz kaydedildi": email.contains("@") ? "gmail adresi degil":"lutfen @gmail.com yazmayi unutmayin";
		System.out.println(sonuc);
		scan.close();
	}

}
