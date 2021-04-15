package day18_whileloop;

import java.util.Scanner;

public class C6_WhileLoop5 {
public static void main(String[] args) {
	//verilen sayinin asal olup olmadigini bulan program yazin
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen asal olup olmadigini bulmak icin pozitif bir tamsayi girin");
			int sayi=scan.nextInt();
			int bolen=1;
			int count=0;
			int asal=0;
			
			while(bolen<=sayi) {
				if (sayi%bolen==0) {
					asal=bolen;
					count++;
				}
				bolen++;
			}

			if (count==2&&asal==sayi) {
				System.out.println("Sayi asal");
			}else {
				System.out.println("Sayi asal degil");
			}
			scan.close();
		}
}
