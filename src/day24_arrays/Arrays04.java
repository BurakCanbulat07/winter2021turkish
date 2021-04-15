package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	// Kullanicidan degerler alarak int bir array olusturun
	// once kullanicidan girecegi sayi adedini almamiz lazim ki array i olusturalim
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen kac sayidan olusan bir array girmek istediginizi yazin");
	int uzunluk=scan.nextInt();
	if (uzunluk>0) {
	int arr[]=new int[uzunluk];
	
	for (int i=0; i<arr.length;i++) {
		System.out.println((i+1)+". degeri giriniz");
		
		arr[i]=scan.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	
	
	}else {
		System.out.println("Gecersiz");
	}
	scan.close();} 
}
