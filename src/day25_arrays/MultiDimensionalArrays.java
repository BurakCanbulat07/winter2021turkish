package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		//1- ic ice array olusturdugumuzdadisaridaki ana array e outer array
		//   icerdeki kucuk arraylere inner array denir
		//2- eger icerdeki arrayllerin boyutlari birbirinden farkli ise
		//   array i ancak tum elemanlari yazarak declare edebiliriz
		//3- multi dimentional array de bir elemanin indexi icin
		//   en disaridaki array haric elemana kadar ic ice olan tum arraylerin
		//   indexlerini yazmak gerekir
		
		@SuppressWarnings("unused")
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};//iki katli bir arraydir
		
		//11 i index ile ifade etmek istersek arr[2][2]
		
		//eger arrayi uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2];
		//[3] ilk yazilan a=sayi outer array in icinde kac tane inner array oldugunu belirtir
		//[2] her bir inner arrayin uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		
		//multidimensional array leri yazdirmak icin toString methodu kullanilmaz
		// cunku to string methodu outher array i string e cevirir
		//outher arrayin icinde inner arrayler oldugundan toString methodunda inner arraylerin
		//referans degerlerini yazdirir
		System.out.println(Arrays.deepToString(arr2));
		
		
	}

}
