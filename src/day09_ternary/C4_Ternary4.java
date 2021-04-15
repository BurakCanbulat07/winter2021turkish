package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {
public static void main(String[] args) {
	//kullanicidan bir tamsayi alin ve
	//sayinin tek veya cift olduunu yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir tamsayi sayi giriniz");
	int sayi = scan.nextInt();
	
	System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");
	
	//girilen sayinin mutlak degerini yazdiriniz
	
	System.out.println("|"+sayi+"| : " +(sayi>0 ? sayi : sayi*-1));
	
	scan.close();
}
}
