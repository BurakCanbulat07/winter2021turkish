package day14_methodcreation;

import java.util.Scanner;

public class C3_MethodCreation3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Ortalamasini alacaginiz 3 sayi giriniz");
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	double sayi3=scan.nextDouble();
	
	ortalama(sayi1,sayi2,sayi3);
	scan.close();
}//main sonu

public static void ortalama(double degisken1, double degisken2,double degisken3) {
	System.out.println("girdiginiz 3 sayinin ortalamasi"+(degisken1+degisken2+degisken3)/3);
}
public static void ortalama(double sayi1, double sayi2) {

	
	System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
}//ortalama sonu
}//class sonu
