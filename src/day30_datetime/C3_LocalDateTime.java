package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {
public static void main(String[] args) {
	
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);//2021-03-19T22:06:44.319892300
	
	System.out.println(ldt.toString());//2021-03-19T22:07:11.339926700
	
	String time= ldt.toString();
	
	System.out.println(time.startsWith("2021"));

	}
}
