package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {
	
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);//2021-03-20T16:10:51.629483100
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		
		/*
		 * yy=yilin son 2 rakami
		 * yyyy=yilin tamamini verir
		 * M=ay sirasini verir mart icin 3
		 * MM=ay sirasini verir mart icin 03
		 * MMM=ay isminin ilk 3 harfini verir
		 * MMMM=ay isminin tamamini verir
		 */
		
		System.out.println(dtf.format(ldt));//21/March/20 04:15
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt));//21/Mar/20
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm");
		
		System.out.println(dtf3.format(ldt));//16:23 24 saatlik sistem
		System.out.println(dtf4.format(ldt));//04:23 12 saatlik sistem
		
		LocalDate dogumTarihim = LocalDate.of(2007, 7, 2);
		LocalDate bugun = LocalDate.now();
		LocalDate babaminTarihi = LocalDate.of(1976, 3, 24);
		
		Period benimYasim = Period.between(bugun, dogumTarihim);
		System.out.println(benimYasim);
		int babamlaFark = Period.between(babaminTarihi, dogumTarihim).getYears();
		System.out.println(babamlaFark);

		
	}

}
