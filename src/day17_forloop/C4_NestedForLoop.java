package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {
public static void main(String[] args) {
	/*
  Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
  *
  * *
  * * *
  * * * *
	 */
	Scanner scan= new Scanner(System.in);
    System.out.println("Lutfen pozitif bir rakam giriniz");
    int sayi=scan.nextInt();
    if (sayi>9||sayi<=0) {
		System.out.println("Gecersiz");
	}else {
		yildizBul(sayi);
	}
    scan.close();
}

private static void yildizBul(int sayi) {
	for (int i=0;i<sayi; i++) {
		System.out.println(" ");
		for(int j=0; j<i; j++) {
		System.out.print("* ");
		}}
	
}
}
