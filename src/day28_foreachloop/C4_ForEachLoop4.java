package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak 
		 * elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 *Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		 */
		
		String arr1[]= {"Ali","Can","Ayse","Seher"};
		String arr2[]= {"Ali","Veli","Mesut","Seher","Sedat"};
		
		List<String> ortak=new ArrayList<>();
		
		for (String each : arr1) {
			for (String w : arr2) {
				if (each.equals(w)) {
					ortak.add(w);
				}
			}}
		
		if(ortak.isEmpty()==true) {
			System.out.println("Ortak eleman yok");
		}else {
			System.out.println("Ortak elemanlar: "+ortak);
		}
	}
}
