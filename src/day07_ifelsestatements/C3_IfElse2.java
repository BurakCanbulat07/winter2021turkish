package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {
public static void main(String[] args) {
	//kullanicidan bir karakter girmesini isteyin
	//harf olup olmadigini yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir karakter girin");
	char karakter=scan.next().toLowerCase().charAt(0);
	
	if (karakter>='a'&&karakter<='z') {
		System.out.println("Harf girdiniz");
	} else {
System.out.println("Harf girmediniz");
	}
	scan.close();
}
}
