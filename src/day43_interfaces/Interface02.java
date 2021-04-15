package day43_interfaces;

public interface Interface02 {

	//Soru su : Buradaki default ve static bizim bildiklerimiz mi?
	//Cevap : HAYIR
	
	default void deneme() {
		System.out.println("default keyword'lu method calisti");
	}
	//bizim bildigimiz default acsess modifier di
	//bir method da birden fazla acsess modifier olur mu?
	//biziminterface de olusturdugumuz tum method lar public dir
	//interface de default keyword kullanarak concrete method olusturabiliriz
	//buradaki default keyword u acsess modifier degil 
	//javanin ozel bir cozumudur
	//buradaki default keyword basina yazlidigi method un concrete oldugunu belirtir
	
	static void deneme2() {
		System.out.println("static keyword'lu method calisti");
	}
	
	//yukaridaki default keyword u icin yazdiklarimiz static isin de gecerlidir
	
	//static ve default keyword u kullanarak oluaturdugumuz methodlar
	//override edilmek ZORUNDA DEGILDIR

}
