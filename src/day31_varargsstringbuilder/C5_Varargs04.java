package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		//toplama(list); varargs esnek oldugu icin lit e benzesede list degildir
		
		int arr[]= {15,20,25};
		toplama(arr);//varargs array olarak calisir ve argument olarak array yollanabilir
		
//		kullanicidan deger alarak varargs calistirmak istiyorsak
//		girilen degerleri bir array'e kaydetmeliyiz
//		bunun icin kulanicidan aldiginiz degerleri esnek oldugu icin bir list e koyariz 
//		sonra list i array e ceviririz  
	}
	
	public static void toplama(int... var) {//data turunden sonra yazdigimiz ... varargs kullanacagimiz anlamina geliyor
		int toplam=0;
		for (int each : var) {
			toplam+=each;
		}
		System.out.println(toplam);
	}
}
