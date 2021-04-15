package day37_overriding;

public class Formen extends Isci{
	public String sorumluOldBol= "Bakim";
	public String isim="Emrullah";
	
	public static void main(String[] args) {
		//Inheritance'da data turu olarak class ismi kullanimi
		
		//Bir class da obje uretirken data turu olarak classin kendisini
		//yada parent(lar)ini kullanabilriz 
		//Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri
		//alacagini anlamak icin once data turu olan class a gideriz
		//orada aradigimiz variable i kullaniriz , yoksa
		//parent(lar)ina bakariz, yukari dogru giderken ik buldugumuz degeri kullaniriz
		
		Formen fr1=new Formen();
		//fr1 objesini kullanarak hangi class'larin variable'lari gorebilirim
		fr1.sorumluOldBol="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBol+" "+fr1.maas);
		
		Isci fr2 = new Formen();
		//Data turu Isci secildigi icin
		fr2.bolum="Kaynak atolyesi";
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);
		
		Personel fr3= new Formen();
		System.out.println(fr3.isim);//Emre
	}

}
