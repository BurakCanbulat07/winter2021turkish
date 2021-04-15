package day04_matematikselislemlermodulus;

public class C2_ModulusOperatoru {
	public static void main(String[] args) {
			//modulus operatoru bolme isleminde kalani verir
		
		//15 tek mi cift mi ? 15/2 kalan=1
		//25 uce bolunur mu ? 25/3 kalan=1
		//herhangi bir sayinin 7 ile bolunbildigini kontrol etmek icin
		//modulus islemi kullaniriz
		
		int kalan= 15 % 4;
		System.out.println(kalan); //3
		
		System.out.println(26 % 8); //2
		
		//856 sayisinin 1ler basamagi kactir? 6
		int sayi=856;
		
		 int birlerBasamagi = 856 % 10 ;
		 System.out.println("sayinin birler basamagi : " + birlerBasamagi);
		 
		 //856 sayisin 10lar basamagi kactir
		 //bunun icin buldugum birler basamagindan kurtulmam gerekiyor
		 //birler basamagindan kurtulmak icin ise sayiyi 10 a boluyorum
		 sayi/=10; //85
		 System.out.println("10 a boldukten sonra sayini degeri : "+ sayi);
		 
		 int onlarBasamagi= sayi % 10;
		 System.out.println("Onlar basamagi : " + onlarBasamagi);
		 
		 //yuzler basamasagini bulmak icin bir kere daha ayni islemi yapiyorum
		 sayi/=10;
		 System.out.println("2 defa 10 boldukten sonra : "+sayi);
			}

}
