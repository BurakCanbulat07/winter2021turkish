package day42_abstractclasses;

public class IdariPersonel extends Personel{
	//extends Personel yazarak abstract Personel e concrete bir child olusturduk
	//ve java CTE verdi
	//cozum olarak urettigi 2 ihtimal var
	//1- unimplemented (uyarlanmamis) methodlari uyarla
	//2- Personel class indan abstract kelimesini sil
	//Bu class i child yapmak icin bunlardan birini yapmaliyiz
	
	public static void main(String[] args) {
		
	}
	
	//concrete bir classda abstract bir method olabilir mi
	//abstract bir method sadece abstract bir class da olusturulabilir
	//public abstract void surekliCalisma();
	//The abstract method surekliCalisma in type IdariPersonel 
	//can only be defined by an abstract class

	@Override
	public void maasHesapla() {
		System.out.println("idari personel maasi 4000 tl");
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}


}
