package day21_scope;

public class Scope1 {
	
	static int okulId= 1201;
	static String okulAdi="Yildiz koleji";
	static boolean acikMi;
	
public static void main(String[] args) {
	System.out.println(okulId+" "+okulAdi+" "+acikMi);// 1201 Yildiz koleji false
	okulId=1202;
	acikMi=true;
	
	staticMethod();
	System.out.println(okulId+" "+okulAdi+" "+acikMi);//1203 Yildiz koleji true
}

public static void staticMethod() {
	System.out.println(okulId+" "+okulAdi+" "+acikMi);//1202 Yildiz koleji true
	okulId=1203;
}

public void method() {
	okulId=1205;
}
}
