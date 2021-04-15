package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {
	public static void main(String[] args) {
		
		/*kullanicidan artik olup olmadigini kontrol
		 * etmek icin yil girmesini isteyin
		 * 
		 * kural 1: 4 ile bolunemeyen yillar artik yil degildir
		 * 
		 * kural 2: 4 un kati olmasina ragmen 100 ile 
		 * bolunebilen sayilardan sadece 400 e
		 * bolunebilenler artik yildir
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4!=0) {
			System.out.println("artik yil degil");
		} else if (yil%100!=0) {
			System.out.println("artik yil");
		} else if (yil%400!=0) {
			System.out.println("artik yil degil");
		} else {
			System.out.println("artik yil");
		}
		scan.close();
	}

}
