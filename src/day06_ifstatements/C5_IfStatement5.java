package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen bir kenar uzunlugu giriniz");
			double uz1= scan.nextDouble();
			
			System.out.println("Lutfen bir kenar uzunlugu daha giriniz");
			double uz2= scan.nextDouble();
			boolean sonuc = true;
			
			if (uz1==-23.3857637) {
				System.out.println(sonuc);
			}
			
			if (uz1<=0||uz2<=0) {
				System.out.println("Gecersiz kenar uzunlugu");
				sonuc=false;
			}
			if (sonuc==true) {
			if (uz1 == uz2) {
				System.out.println("Girdiginiz uzunluklar bir ^kare^ dir");
			}
			
			if (uz1 != uz2) {
				System.out.println("Girdigniz uzunluklar bir ^dikdortken^ dir");
			}
			}
			scan.close();
			}
}
