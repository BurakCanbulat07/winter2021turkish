package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		/*Nested if kullaniniz
		 * 
		 * kullanicidan bir sifre girmesini isteyin
		 * eger ilk harf buyuk ise "A" olup olmadigini kontrol edin ilk harf "A" ise
		 * "gecerli sifre" degilse "gecersiz sifre yazirin"
		 * eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin ilk harf "z" ise
		 * "gecerli sifre" degilse "gecersiz sifre " yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sifrenizi yaziniz");
		
		char ilkHarf=scan.next().charAt(0); // girilen sifrenin ilk harfini alir
		
		if (ilkHarf>='A'&&ilkHarf<='Z') {//ik harf buyuk ise
			if (ilkHarf=='A') {
				System.out.println("gecerli sifre");
			}else {
				System.out.println("gecersiz sifre");
			}
		} else if (ilkHarf>='a'&&ilkHarf<='z') {//ilk harf kucuk ise
			if (ilkHarf=='z') {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}
		} else {//ilk harf buyuk ya da kucuk degilse
			System.out.println("gecersiz sifre");
		}
scan.close();
	}

}
