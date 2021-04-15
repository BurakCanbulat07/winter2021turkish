package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {
	public static void main(String[] args) {
		// kullanicidan VIP kisaltmasinda hangi harfin anlamini istedigini sorun
		//girilen harfin aciklamasini yazdiralim
		//VIP = very important person
		
		Scanner scan=new Scanner(System.in);
		System.out.println("VIP kisaltmasinda anlamini istediginiz harfi yazin");
		String harf = scan.next().toUpperCase();
		
		switch (harf) {
		case "V" :
			System.out.println("Very");
			break;
			case "I" :
				System.out.println("Important");
				break;
				case "P" :
					System.out.println("Person");
					break;
				case "VI" :
					System.out.println("Very Important");
					break;
				case "IP" :
					System.out.println("Important Person");
					break;
				case "PI" :
					System.out.println("Person Important");
					break;
				case "IV" :
					System.out.println("Important Very");
					break;
				case "VIP" :
					System.out.println("Very Important Person");
					break;
				case "VP" :
					System.out.println("Very Person");
					break;
				case "PV" :
					System.out.println("Person Very");
					break;
				case "IPV" :
					System.out.println("Important Person Very");
					break;
				case "PIV" :
					System.out.println("Person Important Very");
					break;
				case "IVP" :
					System.out.println("Important Very Person");
					break;
				case "VPI" :
					System.out.println("Very Person Important");
					break;
				case "PVI" :
					System.out.println("Person Very Important");
					break;
					default :
						System.out.println("gecersiz");
		}
		scan.close();
	}

}
