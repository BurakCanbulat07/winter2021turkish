package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		//try catch blogundaki e nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		@SuppressWarnings("unused")
		Exceptions01 exp=new Exceptions01();
		//esitligin sonundaki Exceptions01 hem class adi hem de exp objesi icin data turu
		
		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
			//ArithmeticException java da bir class ve e objesi icin data turu
			//e ise ArithmeticException class indan olustturdugumuz objenin adi
			//o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
			System.out.println("Sayiyi 0 a bolemezsin");//bizim kullaniciya vermek istedigimiz mesaj
			System.out.println(e);//java.lang.ArithmeticException: / by zero
			//bu durumda hem java ya sorunu yazmasi icin firsat vermis
			//hem de application i bloke etmemis oluruz
			System.out.println(e.getMessage());// / by zero
			
			e.printStackTrace();
			//java.lang.ArithmeticException: / by zero
					//at day38_exceptions.Exceptions03.main(Exceptions03.java:15)	
		}
		System.out.println("Kod bloke olmamissssss");
	}
}
