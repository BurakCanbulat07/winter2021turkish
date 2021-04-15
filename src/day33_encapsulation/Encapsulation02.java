package day33_encapsulation;

public class Encapsulation02 {
	
	private String okulIsmi="Yildiz Koleji";
	//Okul isminin baska class lardan okunmasini ama deger atanmamasini istiyorsak
	//getter() methodu olusturuyoruz
	
	int sayi=100;
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	//Obje olusturularak deger atanip kullanilmasini istedigimiz ama
	//ilk atadigimiz gorunmemesini istiyorsak setter() methodu kullaniriz
	
	public static void main(String[] args) {
		//eger ulasmak istedigim class uyeleri(class member) public degilse baska
		//package lerden ulasmak icin ekstra islem yapmamiz gerekir

		//Yapabilecegimiz islemlerden 1.si Encapsulation (Data saklama)
		// bu class'da  kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim
		
		//private yapinca guvenlik konusunu halletmis olduk
		//ancak class uyelerinin private olmasi OOP concept e aykiri
		
		//Encapsulation classimizda olusturdugumuz class uyelerine
		//kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
	}
	
	private void denemeMethod() {
		System.out.println("Deneme method'u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
}
