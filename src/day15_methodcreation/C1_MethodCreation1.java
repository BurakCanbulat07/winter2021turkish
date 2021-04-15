package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {
public static void main(String[] args) {

	/*Soru 1 ) Kullanicidan bir sayi alin.
		 Bu sayinin negatif veya pozitif oldugunu,
		 tek mi cift mi oldugunu ve
		 3 basamakliysa birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 degilse sadece 1’ler basamagini yazdirin.
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen 3 basamakli bir sayi giriniz");
	int sayi=scan.nextInt();
	
	pozitifNegatif(sayi);//girilen sayi argumentinin pozitif ya da negatif oldugunu yazdirsin
	tekMiCiftMi(sayi);
	buyukMuKucukMu(sayi);
	
	scan.close();
}//main sonu
public static void buyukMuKucukMu(int sayi) {
	int birlerBas = sayi%10;
	if (sayi>99&&sayi<1000) {
		sayi/=10;
		int onlarBas = sayi%10;
		sayi/=10;
		int yuzlerBas = sayi;
		System.out.println( "sayi 3 basamakli. sayinin basamaklari toplami: "+(birlerBas+onlarBas+yuzlerBas));
	}else {
	System.out.println("sayi 3 basamakli degil. sayinin birler basamagi: "+birlerBas);}
}
public static void tekMiCiftMi(int sayi) {
	System.out.println(sayi%2==0?"cift" : "tek");
}
public static void pozitifNegatif(int sayi) {//parametre yazarken data tipini de yazmaliyiz
	System.out.println(sayi>0 ? "pozitif" : sayi==0? "pozitif ya da negatif degil" : "negatif");
}
}//class sonu
