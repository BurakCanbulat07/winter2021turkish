package day42_abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {
		System.out.println(C1_Final.SAYI);
		
		//static bir variable okul ismi gibi herkes icin aynidir
		
		//C1_Final.SAYI+=20;
		//Sayi final variable oldugu icin DEGISTIRILEMEZ
		
		C2_Final2 obj1 = new C2_Final2();
		
		obj1.deneme();
	}
	
	public void deneme() {
		System.out.println("child class daki overriding method");
	}
	
	//public void deneme2() {}
	//Cannot override the final method from C1_Final
	
	// final class yaptigimizda  inherit edilemez
}
