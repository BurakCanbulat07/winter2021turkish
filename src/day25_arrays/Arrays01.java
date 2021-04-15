package day25_arrays;

import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		//Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
		//Array olusturulurken 2 seyi declare etmeliyiz: 1- data type (Bir array in icerisinde
		//sadece ayni data tipinden elemanlar olabilir.) 2- uzunluk (uzunluk array in icerisine koyulacak
		//max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
		
		int arr[]= {10,23,54};//length=3
		String isimler[]=new String[4];//lenth=4 olan bos bir array olusturur
		
		//Array de[ primitive datalar nan-primitive datalarin referanslari store edilebilir
		//Mesela isimler array'inin icinde isim degerleri degil isimlerin referanslari olur
		
		//array in elemanlarina ulasma ve update etme
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
		//array in tum elemanlarini yazdirma
		System.out.println(isimler);//referansi yazdirir
		System.out.println(Arrays.toString(isimler));
		
		for(int i=0; i<isimler.length;i++) {
			System.out.print(isimler[i]+" ");
		}
		System.out.println();
		
		System.out.println(arr);//referans [I@123772c4
		System.out.println(Arrays.toString(arr));
		
		//array in elemanlarini nasil tanimlayabiliriz
		isimler[1]="Oguzhan";
		isimler[3]="bilal";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
	}
}
