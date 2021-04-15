package day14_methodcreation;

public class C1_MethodCreation1 {
public static void main(String[] args) {

	String str="Java cok guzel";
	//Java methodlarin sadece ismine degil , isim + argument'lere bakar
	//sadece parametre sayisi degil parametrelerin data tiplerine bakar
	
	str.endsWith("el");//bu methodun gorevi gidip kelimenin son kismini kontrol etmek
					   //bu methodu kullanmak icin bu method u kontrol ettikten sonra
					   //bana rapor olarak ne getirdigini bilmem lazim(true/false)
	
	// 2) bir method olusturdugumzda method un ne yapacagina
	//    ve gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
	
	// 3) Bir method olusturulurken str.indexOf(str, fromIndex) de oldugu gibi 
	//disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
	//deklare etmeliyiz
	
	  //    Method'u calistirmak istedigimizde (Method'u cagirmak) Parametre olarak 
    //    declare edilen data tiplerine uygun degerler girmeliyiz.
    //    girilen bu degerlere ARGUMENT denir.
	
	str.indexOf("va", 1);
}
}