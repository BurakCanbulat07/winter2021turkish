package day29_passbyvalueimmutable;

public class C5_Immutable02 {
	public static void main(String[] args) {
		
		// degisikligi kalici yapmak icin atama yaparsak
        // immutable class'lar nasil davranir ?
        String isim="Ali";
        
        isim=isim+"";
        
        System.out.println(isim.equals("Ali")); // true
        System.out.println(isim=="Ali"); // false
		
		String str1 = new String("Mehmet"); // String bir obje oldugu icin new keyword'unu kullanabiliyorum cunku obje olusturuyorum
        String str2 = new String("Mehmet"); // new keyword oldugu icin once objeyi olusturur o yuzden referanslari farkli olur
        
        System.out.println(str1.equals(str2)); // True 
        System.out.println(str1==str2); // False 4 yukari satirdaki aciklamadan dolayi false
        
        String str3 = "Mehmet"; // str3'u olusturduk. sonra str4'u olusturdugumuzda java diyorda str3'de aynisi var bir daha neden olusturayim
        String str4 = "Mehmet"; // diyor ve str4'un referansini str3'e atayip hafiza tasarrufu yapiyor .(String havuzunda ki ayni objeye atiyor)
        
        System.out.println(str3==str4); // true
        System.out.println(str3.equals(str4)); // true
        
        System.out.println(str3==str1); // false
        System.out.println(str3.equals(str1)); // true
	}

}
