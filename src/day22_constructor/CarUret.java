package day22_constructor;

public class CarUret {
	//SORU............BU CLASS DA CONSTRUCTOR NEREDE
	//su anda bu class da gorunur bir constructor yok
	//bir class olusturuldugunda java bu class dan obje uretilecegini bilir
	//ve gorunmeyen DEFAULT CONSTRUCTOR i class a yerlestirir
	//default constructor parametresizdir folayisiyla sadece hicbir ozelligi tanimlanamayan 
	//objeler uretir(tisort uret)
	//default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	
	//eger biz sonradan bir constructor yazarsak, java default constructor i iptal eder
	
	//Bir constructor olusturalim
	public CarUret (){
	}
	//kurallar 1- ismi class ile ayni olmalidir(dolayisiyla buyuk harfle baslar
	//2- Constructor return type'a sahip degildir
	//3- Constructor isminden sonra mutlaka parantez olur() ama parametre olmasi opsiyoneldir
	//4- Bir cnstructor olusturuldugunda kimlerin kullanacigini belirlemek icin acsess modifier yazilir
	    String marka;
	    String model;
	    int yil;
	    boolean kazasiVarMi;
	    //bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	    //bu class'da olusturulacak objelere ait tum ozellikler olur
	    //bu class direk calismayacagi icin main method olmasada olur
	    //(kaliphane gibi)

public void yakit(String yakit) {
	System.out.println("Araba yakit olarak "+yakit+" kullanir");
}

public void vites(String vites) {
	System.out.println("Araba "+vites+" viteslidir");
}

}