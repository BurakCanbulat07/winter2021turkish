package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		//list i tersten yazdir
		
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
			li.next();
		}
		
		while (li.hasPrevious()) {
			int sayi = li.previous();
			System.out.print(sayi+ " ");
		}
	}
}
