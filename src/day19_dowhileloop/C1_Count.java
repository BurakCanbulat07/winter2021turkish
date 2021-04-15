package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {
public static void main(String[] args) {
	//kullanicidan bir cumle veya bir harf isteyin
	//while loop kullanarak cumlede stenen harf kac kere kulllanilmis bulunuz
	//Case sensitive olsun
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir cumle giriniz");
	String cumle=scan.nextLine();
	System.out.println("Lutfen saymak istediginiz harfi girin");
	String harf=scan.next().substring(0, 1);
	
	int count=0;
	
	int index=0;
	while(index <cumle.length()) {
		if (cumle.substring(index, index+1).equals(harf)) {
			count++;
		}
		index++;
	}
	System.out.println("Girdiginiz cumlede "+count+" tane '"+harf+"' harfi var");
	
scan.close();}
}
