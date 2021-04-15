package day11_stringmanipulations;

public class C2_CharAt {
	public static void main(String[] args) {
		//charAt(index)
		//scan.next().charAt(0) 0. indexdeki karakteri verir
		//index 0'dan baslar
		
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); // J
		
		System.out.println(str.charAt(5)); // c
		
		System.out.println(str.charAt(13)); // 1
		// kelimenin uzunlugu son index +1 dir
		// son index kelimenin uzunlgu(length) -1
		// kullanici 10 harfli bir kelime girese abcd efghi
		//bana son harfi verecek kodu yaziniz
		//str.charAt(9)
		
		//System.out.println(str.charAt(15)); //exception verir
		//eger index olarak String in uzunlugu veya daha buyuk sayi girilirse
		
		//String str3=5; // Compile Time Error CTE
					   // Kod calismadan java nin farkina varip altini cizdigi hatalardir
					   //Derleme Zaman Hatasi
				       // bu tur hatalari yok etmeeden java kodu calistirmaz
		
		//System.out.println(str.charAt(14)); // bazi hatalar syntax dan anlasilmaz
		// ancak kod calistiktan sonra anlar
		//kod run edilince ortaya ciktigindan 
		//Run Time Error Denir RTE
	}

}
