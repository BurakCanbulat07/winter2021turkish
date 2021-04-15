package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterator03 {
	public static void main(String[] args) {
		/*Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
		 *  (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
		 *Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
		 *output: [23,40]
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk sayiyi girin");
		int sayi1=scan.nextInt();
		System.out.println("Ikinci sayiyi girin");
		int sayi2=scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		
		ListIterator<Integer> li=list.listIterator();
		
		while (li.hasNext()) {
			
			int sayi=li.next();
			if(sayi1>sayi2) {
			if (sayi>sayi1||sayi<sayi2) {
				li.remove();
			}}else if(sayi1<sayi2) {
				if (sayi<sayi1||sayi>sayi2) {
					li.remove();
				}}else {
					throw new IllegalArgumentException("Sacmalama");
				}
		}
		System.out.println(list);
	}

}
