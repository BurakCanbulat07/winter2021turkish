package day15_methodcreation;

public class C4_ForLoop {
public static void main(String[] args) {
	//5 kere hello world yazdirin
/*System.out.println("Hello World");--1
 *System.out.println("Hello World");
 *System.out.println("Hello World");
 *System.out.println("Hello World");
 *System.out.println("Hello World");--5
 */
	
	//bunun yerine loop kullaniriz
	//ne yapacagimizi ve kac kere yapacagimizi soyluyoruz
	
	//tum looplarda 3 seyi yazmak zorundayiz
	//1. baslangic degeri
	//2. bitis degeri
	//3. artis degeri
	
	for(int i=1;i<=5 ; i++) {
		System.out.println("Hello World");
	}
}
}
