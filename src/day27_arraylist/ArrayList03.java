package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
	public static void main(String[] args) {
		//kullanicidan pozitif bir sayi tamsayi alin
		//aldiginiz sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		//1 1 2 3 5 8 13 21 34
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		
		if(sayi<1) {
			System.out.println("Gecersiz");
		}else {
			
			for(int i=2;fibo.get(i-2)+fibo.get(i-1)<sayi;i++) {
				
				fibo.add(fibo.get(i-2)+fibo.get(i-1));

			}
			System.out.println(fibo);
		}
	scan.close();}

}
