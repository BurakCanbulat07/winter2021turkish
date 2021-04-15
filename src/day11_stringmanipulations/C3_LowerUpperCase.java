package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {
	public static void main(String[] args) {
		//str.LowerCase() verilen string i kucuk harf yapar
		//str.UpperCase() verilen string i buyuk harf yapar
		
		String str = "Techproeducation";
		
		//str'i buyuk harfle yazdirmak istersek
		System.out.println(str.toUpperCase());
		//str i buyuk harfe cevirmek istersek
		str=str.toUpperCase(); //bu satirda BUYUK harf olan str yi kalici olarak BUYUK yaptik
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
	}

}
