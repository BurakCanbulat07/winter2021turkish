package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{
	
	public String bolum="takimhane";
	public int soruOldIsciSay=10;
	
	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		
		System.out.println(ub1.bolum);//takimhane
		System.out.println(ub1.soruOldIsciSay);//10
		System.out.println(ub1.saatUcreti);//20
		System.out.println(ub1.isim);//Mehmet
		
		Isci ub2=new UstaBasi();
		List<String> list = new ArrayList<>();
		Object str= new String("Hasan");
		//Extends ile birbirine bagli olan classlarda Is a relation olan
		//data turleri istege bagli olarak kullanilabilir
		//Daha genis data turu yazmanin avantaji
		//kapsamin daha genis olmasi
		//daha genis data turu yazmanin dezavantaji
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3=new UstaBasi();
	}

}
