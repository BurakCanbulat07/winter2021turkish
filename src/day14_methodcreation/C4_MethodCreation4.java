package day14_methodcreation;

public class C4_MethodCreation4 {
public static void main(String[] args) {
	toplama(60,50);
	toplama(60.2,50.3);
	toplama(60,50.3);
	toplama('#','&');
	toplama("Bu","rak");
}//main sonu
public static void toplama(int sayi1 ,int sayi2) {
	System.out.println("integer method sonucu : "+(sayi1+sayi2));
}
public static void toplama(double sayi1 ,double sayi2) {
	System.out.println("double method sonucu : "+(sayi1+sayi2));
}
public static void toplama(int sayi1 ,double sayi2) {
	System.out.println("int-double method sonucu : "+(sayi1+sayi2));
}
public static void toplama(char sayi1 ,char sayi2) {
	System.out.println("char method sonucu : "+(sayi1+sayi2));
}
public static void toplama(String sayi1 ,String sayi2) {
	System.out.println("string method sonucu : "+(sayi1+sayi2));
}

}//class sonu
