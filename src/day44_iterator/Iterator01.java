package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);//[A, B, C, D]
		
		//Her elemana B harfini ekleyelim
		
		for (String each : list) {
			each=each+"B";
			System.out.print(each+" ");
		}
		System.out.println();
		System.out.println(list);
		
		//collections'da her yapi index i desteklemez. Ornegin Set de index olmaz
		//Index olmayinca mecburen tum elemanlara ulasmak icin for each loop kullanilir 
		//for each loop ile de update veya delete yapamayiz
		//Bunun icin java iterator interface ini olusturmustur 
		
		Iterator it1= list.iterator();
		//next(), hasNext(), remove() methodlara sahiptir 
		//listedeki tum elemanlari iterator kullanarak silelim
		
		while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		System.out.println(list);
		
	}
}
