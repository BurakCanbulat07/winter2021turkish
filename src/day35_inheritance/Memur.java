package day35_inheritance;

public class Memur extends Personel{
	public int maas;

	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super("Seher",6000);
		System.out.println("Child class parametreli constructor calisti");
	}
	
	
	
	/*
	 * Inheritance da cons olusturdugumuzda java nin otomatik olarak cons a 
	 * koydugu super() keyword onemlidir
	 * super() keyword default cons gibidir Biz gormesek de calisir ancak yerine
	 * baska bir keyword yazarsak etkisiz hale gelir
	 * ***extends varsa  yerine birsey yazmadikca super() calisir***
	 */
	
	public static void main(String[] args) {
		Memur obj1 = new Memur();
		Memur obj2 = new Memur(2400);
		
	}
}
