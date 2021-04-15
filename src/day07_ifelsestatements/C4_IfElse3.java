package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {
public static void main(String[] args) {
	
	//kullanicidan yasini isteyin
	//65 ten buyukse emekli olabilirsin yoksa emekli olamazsin yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Yasinizi giriniz");
	int yas=scan.nextInt();
	
	int kalan = 65-yas;
	int gecen = yas-65;
	if (yas>= 65) {
		System.out.println(gecen+" yildir emekli olabilirsin");
	} else {
     System.out.println("emekli olmaniza kalan zaman : "+kalan);
	}
	scan.close();
}
}
