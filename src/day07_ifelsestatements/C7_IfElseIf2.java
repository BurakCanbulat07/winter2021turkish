package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("1. sayiyi girin");
		double sayi1=scan.nextDouble();
		System.out.println("2. sayiyi girin");
		double sayi2=scan.nextDouble();
		
		if (sayi1>0&&sayi2>0) {
			System.out.println("sayilarin toplami : "+(sayi1+sayi2));
		} else if (sayi1<0&&sayi2<0) {
			System.out.println("sayilarin carpimi : "+(sayi1*sayi2));
		} else if (sayi1<0&&sayi2>0||sayi1>0&&sayi2<0) {
			System.out.println("Farkli isaretli sayilarla islem yapamazsin");
		} else if (sayi1==0||sayi2==0) {
			System.out.println("0 carpmaya gore yutan elemandir");
		}
		scan.close();
	}

}
