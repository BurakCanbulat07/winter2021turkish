package day21_scope;

public class Scope4 {
public static void main(String[] args) {
	int sayi=10;
	System.out.println(sayi);
	//1- bir method icinde olusturulan variable sadece o method icinde kullanilabilir
	//1- System.out.println(isim);
	
	@SuppressWarnings("unused")
	int sayi2;// 2- bir local variable deger atanmadan da olusturulabilir
	//2- System.out.println(sayi2);// ancak ilk deger atamasi yapilmayan variable lar kullanilamaz
	//2- sayi++; // ilk deger atanmadigi icin arttirma yada azaltma yapilamaz
	//2- java deger atamasi olmadan local variable olusturulmasina izin verir, ilerde deger atanacak diye bekler
	
	sayi2=15;//2- olustruma ayri satirda(9.satir),deger atama ayri satirda(14.satir) yapilabilir
	
	//3- birden fazla method un ldugu class larda her methodda kullanmamiz gereken
	//3- variable lar varsa class level da variable olusturmaliyim
	//3- ortak variable class in yapisina bagli olarak instance veya static olabilir
}

public static void staticMethod() {
String isim="Hasan";
System.out.println(isim);
//1- System.out.println(sayi); bu kurala main method da olusturulanlar icin de gecerlidir
}

public void method() {
	boolean isTrue=true;
	System.out.println(isTrue);
	//1- System.out.println(sayi); Bu kural static olan ya da olmayan tum methodlar icin gereklidir
}

}
