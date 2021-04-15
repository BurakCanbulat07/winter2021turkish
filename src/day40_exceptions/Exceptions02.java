package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		
		//try-catch blogu exception ile handle etmekte kullanilir
		//throws keyword u ise sadece decleration
		//throws kullanilan bir method da exception olusursa KOD BLOKE OLUR
		
		int k=0;
		 while((k=fis.read())!=-1) {
             System.out.print((char)k);
         }
		 
		 //eger birden fazla exception icin throws keyword u kullanacaksak
		 //yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
		 //eger yazdigimiz exceptionlar arasinda parent child iliskisi varsa
		 //once child exception yazilmalidir, yoksa child erisilemez olur
		 
		 //eger yazacaklarimiz arasinda parent child iliskisi varsa 
		 //istersek sadece parent i yazmamiz da yeterli olur
	}
}
