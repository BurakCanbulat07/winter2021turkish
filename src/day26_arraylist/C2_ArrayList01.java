package day26_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2_ArrayList01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//bir array list nasil olusturulur
		//arraylist bir objedir dolayisiyla yeni bir tane olusturmak icin
		//new keyword kullanmaliyiz
		
		//1.yol
		ArrayList<String> list=new ArrayList<String>();
		
		//2.yol
		ArrayList<String> list2=new ArrayList<>();
		
		//3.yol  En cok kullanilan
		List<String> list3=new ArrayList<>();
		
		//Not: eger constructor olarak List<>() kullanilirsa
		//List<>() constructor olarak kullanilmaz
		
		//List <String> list4=new List<>();

		//olusturdugumuz class isimleri java da kullanilan obje isimleri ile ayni olmamalidir
		
		//List e eleman ekleme
		//List olustururken otomatik olarak eleman ekleme ozelligi yoktur
		//elemanlarin tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		//list nasil yazdirilir
		
		System.out.println(list3);
		
		list3.add(1, "Can");
		System.out.println(list3);
		
		list3.add(1, "Fatma");
		System.out.println(list3);
		
		/*verilen arrayden istenen degere esit olan elemanlari kaldirip
		 * kalanlari yeni bir array olarak yazdirin
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		
		List<Integer> istenenList = new ArrayList<>();
		
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
		}
		
		System.out.println(istenenList);
		
	scan.close();}

}
