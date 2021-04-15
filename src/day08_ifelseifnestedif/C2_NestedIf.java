package day08_ifelseifnestedif;

import java.util.Scanner;

public class C2_NestedIf {
	public static void main(String[] args) {
		//nested : ic ice
		//verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		//yazdiran bir java programi yazdirin
		//eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//calisan erkekse 65 yasindan buyuk oldugunda emekli olabilir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz");
		String cinsiyet=scan.next();
		System.out.println("Yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {if (yas>=65&&yas>0&&yas<200) {
			System.out.println("Emekli olabilirsin beyfendicigim");}
		if (yas<65&&yas>0&&yas<200) {
			System.out.println("Emekli olamazsin beyfendicigim");}else {
				System.out.println("DUZGUNCE YAZ lutfen  -,-");
			}} else if (cinsiyet.equalsIgnoreCase("kadin")) {
				if (yas>=60&&yas>0&&yas<200) {System.out.println("Emekli olabilirsin hanfendicigim");}
				if (yas<60&&yas>0&&yas<200) {System.out.println("Emekli olamazsin hanfendicigim");}else {
					System.out.println("DUZGUNCE YAZ lutfen  -,-");
				}
				}else {
					System.out.println("DUZGUNCE YAZ lutfen  -,-");
				}
				
				scan.close();
			
		}
	}


