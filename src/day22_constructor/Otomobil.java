package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){//istersek cnstructor i parametreli olarak olusturabiliriz
		
	}
	//biz bir constructor olusturdugumuzda java default olani siler
	//dolayisiyla biz bir constructor olusturdugumuzda mutlaka
	//default constructor in yerine de bir constructor yazmaliyiz
	public Otomobil() {
		
	}
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) {//method
		System.out.println("Araba yakit olarak "+yakit+" kullanir");
	}

	public void vites(String vites) {//method
		System.out.println("Araba "+vites+" viteslidir");
	}
}
