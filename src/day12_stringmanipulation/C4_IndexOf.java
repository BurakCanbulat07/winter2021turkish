package day12_stringmanipulation;

import java.util.Scanner;

public class C4_IndexOf {
	public static void main(String[] args) {
		//indexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur
		
		String str= "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));//g
		
		System.out.println("char arama "+ str.indexOf('g'));//6
		
		System.out.println("string arama "+str.indexOf("g"));//6
		
		System.out.println("string kelime arama " + str.indexOf("is"));//i->12 s->13 // 12
		
		System.out.println("birden fazla varsa "+str.indexOf("i"));//ilk buldugunun index ini 12
		
		System.out.println("baslangic indexi ile "+str.indexOf('a', 4));// bas. indexi inclusive
		
		System.out.println("olmayan harf "+str.indexOf("dert"));//
		
		//kullanicidan bir cumle isteyin
		//case sensitive olmadan Java kelimesini icerip icermedigini yazdirin
		
		System.out.println("_______________________________________________________________________________________________________");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle girin");
		String klm= scan.next().toLowerCase();
		
		int sonuc= klm.indexOf("java");
		
		System.out.println(sonuc==-1 ?"java kelimesini icermiyor" : "java kelimesini iceriyor");
		scan.close();
	}

}
