package day31_varargsstringbuilder;

public class C3_Varargs02 {
	
	public static void main(String[] args) {
		//Var---variety = cesitlilik / args----arguments
		
		toplama(2,3);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
	}

	public static void toplama(int... var) {//data turunden sonra yazdigimiz ... varargs kullanacagimiz anlamina geliyor
		int toplam=0;
		for (int j : var) {
			toplam+=j;
		}
		System.out.println("Sayilarin toplami: "+toplam);
	}

}
