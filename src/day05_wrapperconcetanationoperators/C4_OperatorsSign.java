package day05_wrapperconcetanationoperators;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// = atama / assignment isareti
		
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat = sayi1>sayi2; // true/false
		System.out.println(isGreat);//isGreat
		
		boolean isSmall= sayi1<=sayi2;//false
		System.out.println(isSmall);//false
		
		boolean isEqual= sayi1==sayi2;// == esit mi anlamina gelir ve Comparison operator diye gecer
		System.out.println(isEqual);//false
		
		System.out.println(sayi1==5);//true
		
		System.out.println(sayi1*sayi2==20);//true
		
		System.out.println(sayi1+sayi2 != 9);//sayilarin toplami 9 degil. false
		
		System.out.println(sayi1 - sayi2 !=0);//(5-4) sifira esit degildir true
		
		//tum mantiksal ifadelerde ! kullanildigida olumsuzluk anlami katar
		
		

	}

}
