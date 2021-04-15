package day11_stringmanipulations;

public class C4_Equals {
	public static void main(String[] args) {
		//str.equals(str2) str ve str2 yi karsilastirir ve String olarak esit olup olmadiklarina bakar
		//sonuc olarak true veya false  dondurur
		
		//bazi methodlarin yaptiklari islem ine dondurdukleri sonuc farkli olabilir
		//bir methoda git ali ismindeki elementi sil deriz
		//o da gidip ali yi bulur ve siler
		//
		
		String str = "Ali Can";
		String str2 = "Ali Can";
		
		//str ile str2 nin esit olup olmadigini yazin
		//esit veya degil yazdirin
		
		System.out.println(str.equals(str2)); // true
		
		System.out.println(str.equals(str2)? "esit" : "esir degil");
		
	}

}
