package day12_stringmanipulation;

public class C1_EqualsCiftEsittirFarki {
	public static void main(String[] args) {
		
		String str1 = "Ali Can";
		String str2 = str1 + "" ; // Ali Can
		
		System.out.println(str1==str2);//false
		// == stringlerin hem degerlerine hem de adreslerine bakar 
		//bu ornekte str1 + "" yazdigimizde concatination yapdigi icin java yeni bir obje 
		//olusturur ve islemin sonucunu yeni objenin iine koyar
		
		System.out.println(str1.equals(str2));//true
		
		//equals() methodu sadece stringlerin degerlerini karsilastirir
		//bu ornekte str1 ile str2 nin degerleri AYNI oldugu icin true dondurur
		
		String str3 = str1;
		System.out.println(str3==str1);//true
		System.out.println(str1.equals(str3));//true
		
		
	}

}
