package day05_wrapperconcetanationoperators;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (birlestirme) : java da birden fazla string i toplama isareti ile 
		//toplarsaniz java bu sringleri yan yana yazar
		String str1="Java";
		String str2="Guzeldir";
		String bosluk= " ";
		
		System.out.println(str1+str2); // JavaGuzeldir
		//eger arada bosluk birakmak isterseniz
		System.out.println(str1+" "+str2);// Java Guzeldir
		
		System.out.println(str1+' '+str2);
		System.out.println(str1+bosluk+str2);
		//GuzeldirJava
		System.out.println(str2+str1);
		
		int sayi1= 5;
		int sayi2= 4;
		//verilen dgiskenleri kullanarak consolda 9 yazdirin
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+str1+str2);
		System.out.println(str1+str2+sayi1+sayi2);
		System.out.println(str1+str2+(sayi1-sayi2));
		
		//verilen degiskenlerle 9 JavaGuzeldir yazdirin
		System.out.println(sayi1+sayi2+' '+str1+str2);
		
		//Java matematiksel islem yaparken char data turunden bir degerle
		//karsilasnca o char in ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2);//9Java Guzeldir
		
		System.out.println(str1+str2+sayi1*sayi2);// JavaGuzeldir20
		
		//son tekrar
		/*kural 1) eger toplanan degerlerden bir tanesi bile string ise java toplama degil
		 *            concatenation (birlestirme) yapar
		 *kural 2) eger toplanan degerlerin ikiside matematiksel islemse java toplar
		 *kural 3) eger sayi ve string degiskenleri birlikte kullanilacaksa oncelikler
		 *belirlenip o islemler icin parantez kullanilabilir
		 *kural 4)matematiksel bir islemde char degisken kullaniliyorsa, java char in ascii degerini
		 *isleme alir
		 *kural 5) char bir degisken ile string bir degisken toplanilirsa concenation olur
		 */
		
		
	}

}
