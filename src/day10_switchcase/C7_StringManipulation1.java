package day10_switchcase;

public class C7_StringManipulation1 {
	public static void main(String[] args) {
		// String non-primitive data turundendir
		//non-primitive data turleri value ile birlikte method lara sahiplerdir
		//methodlari kullanarak string i degistirmeye String Manipulation denir
		
		String str= "Hello Universe";
		System.out.println(str.toUpperCase()); //HELLO UNIVERSE
		
		System.out.println(str); //Hello Universe
		
		String str2= str.toUpperCase();
		System.out.println(str);// Hello Universe
		System.out.println(str2);//HELLO UNIVERSE
		
	}

}
