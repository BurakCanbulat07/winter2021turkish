package day31_varargsstringbuilder;

public class C2_Varargs01 {
	
	public static void main(String[] args) {
		//Verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		toplam(sayi1,sayi2);
		//uc sayiyi toplayin
		toplam(sayi1,sayi2,sayi3);
		
		//oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		toplam(2,3);// iki sayinin toplami methodu
		toplam(2,5,8);// uc sayinin toplami methodu
		//istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin 
		//Java varargs olusturmus
	}
	
	public static void toplam(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami: "+(sayi1+sayi2+sayi3));
	}

	public static void toplam(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin toplami: "+(sayi1+sayi2));
	}

}
