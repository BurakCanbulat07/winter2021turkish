package day11_stringmanipulations;

public class C1_Concatenation {
	public static void main(String[] args) {
		//concatenation : java da + islemi yapilirken eger toplanan ifadelerden biri veya
		// her ikisi string ise javva toplama degil birlestirme yapar
		
		System.out.println(15+20+ "merhaba");// 35merhaba
		System.out.println("merhaba"+15+20);// merhaba1520
		System.out.println("merhaba"+(15+20));// merhaba35
		System.out.println("merhaba"+15*20);//merhaba 300
		
		String str1 = "hello";
		String str2 = "world";
		
		// hello world yazdirmak istersek
		System.out.println(str1+" "+str2);
		
		System.out.println(str1.concat(str2));//helloworld
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str1.concat(" "+str2));//hello world
	}

}
