package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {
	public static void main(String[] args) {
		//list in uzunlugu nasil bulunur
		List<Integer> list =new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);//[10, 15, 8, 12, 20]
		
		System.out.println(list.size());//5
		
		//bir eleman nasil silinir
		list.remove(1);//[10, 8, 12, 20]
		System.out.println(list);
		
		System.out.println(list.remove(2));//git 12yi kaldir
		System.out.println(list);//[10, 8, 20]
		
		//System.out.println(list.remove(5));//git 5 i kaldir//RTE
		
		List<String> list2=new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan"));//git hasan i kaldir//false

	}

}
