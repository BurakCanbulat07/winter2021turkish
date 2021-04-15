package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {
	public static void main(String[] args) {
		//OOP concept 
		//Object Oriented Programming
		//Bir proje kapsamindaki classlarda olusturulan variable ve methodlarin
		//baska classlarda tekrar tekrar yazilmamasi, var oldugu classdan obje uretilerek
		//bu variable ve methodlarin istendigi kadar kullanlmasidir (reusibility)
		//Write One Reuse Anywhere
		
		//Scope 6 class indaki variable ve methodlara ulasmak istiyorum
		//bunun icin Scope6 classindan obje uretmeliyiz
		
		
		//acsess modifier yazilmadigi icin default acsess modifier gecerlidir
		//sadece kendi paketinde kullanilir
		
		Scope6 obj1= new Scope6();
		//esitligin sol tarafi declaration
		//declaration 2 parcadir ilk parca data turu, ikinci parca isim
		//non-primitive ler icin data turu ani zamanda class ismi olabilir
		//esitligin saginda ise deger, iki parcadan olusur
		//ilki new keyword,u ikincisi constructor
		//hangi class dan obje uretmek istersek o class in constructor ini kullaniriz
		obj1.num1=10;
		System.out.println(obj1.num1);//10
		obj1.add();
		
		//deneme() method unu main icinden cagirabilir miyim
		//deneme(); hayir static degil obje ureterek cagirabilirim
		
		Encapsulation01 obj3=new Encapsulation01();
		obj3.deneme();
		
	}
	
	public void deneme() {
		//Projemiz kapsaminda bulunan tum class lardan
		//public variable methodlara istedigim yerden obje ureterek ulasabilirim
		//eger ulasmak istedigim class uyeleri(class member) public degilse baska
		//package lerden ulasmak icin ekstra islem yapmamiz gerekir
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=20;
		obj2.method();
		
		//ben istedigim classdan obje uretip oradaki public class uyelerine ulasabilirim
	}
	
	
	
	

}
