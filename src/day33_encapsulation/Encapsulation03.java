package day33_encapsulation;

public class Encapsulation03 {
	
	public static void main(String[] args) {
		//Encapsulation02 classindaki class member a ulasmaya calisalim
		Encapsulation02 obj1 = new Encapsulation02();
		
		//Biz erisim yetkisini 2'ye ayiriyoruz
		//1- okuyabilme
		//2-degistirip kullanabilme
		
		System.out.println(obj1.sayi);
		System.out.println(obj1.getOkulIsmi());
		
		obj1.setHesapNo(546789);
		
	}

}
