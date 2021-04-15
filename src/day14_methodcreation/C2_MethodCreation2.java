package day14_methodcreation;

public class C2_MethodCreation2 {
	public static void main(String[] args) {	
		//bir method u calistirmak icin main method u n icinden cagirmamiz gerekir
		//bir method u cagirmak icin ise method adin ve parametrelere uygun argumentlari
		//yazmaliyiz
}//main method sonu
	
	// bir method olusturmak isteigimizde class in icinde ama main method un disinda
	//bir alanda olusturmaliyiz. genel kullanim methodlar main method dan sonra olur
	public static void ortalama(double sayi1, double sayi2) {

	
		System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
	}//ortalama sonu
	//bir methodu olusturmak o method u calistirmak icin yeterli degildir
	//olusturulan method main method icinde cagirilinca calisir
	
}//class sonu
