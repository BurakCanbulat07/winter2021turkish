package day05_wrapperconcetanationoperators;

public class C1_ModulusSon {
	public static void main(String[] args) {
		
		//verilen bir integer in birler basamagindaki rakami yazdirin
		
		int sayi=1469;
				
		System.out.println("verilen sayinin birler basamagi : "+sayi%10);
		
		// verilen sayinn birler basamagi haric geiye kalan basamaklari yazdirin
		
		System.out.println(sayi/10); //146
		
		// sayi/10 ile sayi/=10 arasindaki fark nedi?
		// =isareti atama(assignment) demektir
		// bir islemde= isareti varsa deger kalici olarak degisir
		// = isareti yoksa sadece o anlik matematiksel islem yapar
		// sayi/10 yazilirsa sayinin degeri degismez
		//sayi /=10 yazilirsa sayi 10 a bolunur ve yeni deger olarak sayiya atanir
		
		
	}

}