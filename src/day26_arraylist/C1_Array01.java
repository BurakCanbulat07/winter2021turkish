package day26_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class C1_Array01 {
	public static void main(String[] args) {
		/*verilen arrayden istenen degere esit olan elemanlari kaldirip
		 * kalanlari yeni bir array olarak yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		
		int count=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]==sayi) {
				count++;
			}
		}
		
		int uzunluk=arr.length-count;
		
		int arr2[] = new int[uzunluk];
		
		int temp=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=sayi) {
				arr2[temp]=arr[i];
				temp++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	scan.close();}
}
