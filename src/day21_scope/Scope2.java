package day21_scope;

public class Scope2 {
public static void main(String[] args) {
	//Static variable'lar icin obje olusturma ihtiyavi yoktur
	//Baska bir class'dan static variable'lara ulasmak istedigimizde 
	//ulasmak istedigimiz class'in adi.static variable adi yazmamiz yeterlidir
	
	System.out.println(Scope1.okulAdi);
	System.out.println(Scope1.okulId);//java run time programdir
									  //Scope2 class i calistirildiginda Scope1 calismaz!!!!!
									  //dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
	
	Scope1.okulAdi="Mehmet koleji";
	System.out.println(Scope1.okulAdi);//Mehmet koleji
	
	Scope1.staticMethod();
	System.out.println(Scope1.okulId);
	System.out.println(Scope1.okulAdi);
	
}
}
