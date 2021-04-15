package day13_stringmanipulation;

public class C8_Examples2 {
public static void main(String[] args) {
	String str1= "$13.99";
	str1=str1.replaceAll("\\D", "");
	System.out.println(str1);
	
	String str2= "$10.55";
	str2=str2.replaceAll("\\D", "");
	System.out.println(str2);
	//str1 ve str2 icerigi sayi olan stringler dir
	//eger iceriginin tamamen oldugunu bildigimiz String varsa 
	//parseDouble() veya parseInteger() methodu kullanabiliriz
	//ancak primitive data tipleri method a sahip olmadigindan
	//wrapper class kullanmam lazim
	Double sayi1 = Double.parseDouble(str1);
	Double sayi2 = Double.parseDouble(str2);
	
	double toplam= (sayi1+sayi2)/100;
	System.out.println("$"+ toplam);
}
}
