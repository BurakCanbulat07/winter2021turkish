package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			System.out.println("Vereceginiz maas icin bir teklifte bulunun");
			double maas=scan.nextDouble();
			
			if (maas>80000) {
				System.out.println("Kabul Ediyorum");
			} else if (maas>60000) {
				System.out.println("Konusabiliriz");
			} else if (maas<60000) {
				System.out.println("Maalesef Kabul edemem");
			}
			scan.close();
	}

}
