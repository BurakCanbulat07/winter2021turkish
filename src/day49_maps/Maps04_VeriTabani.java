package day49_maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Maps04_VeriTabani {
	
	public static void main(String[] args) {
		
		String dosyaYolu="C:\\Users\\Lenovo\\eclipse-workspace\\winter2021turkish\\src\\day49_maps\\New.csv";
		
		Map<String,String> veriMap=VeriTabaniAl(dosyaYolu);
		System.out.println(veriMap);
	}

	public static Map<String, String> VeriTabaniAl(String dosyaYolu) {
		
		Map<String,String> eklenecekMap = new HashMap<>();
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
				String satir=br.readLine();
				
				
				while (satir !=null) {
					String keyValue[] = satir.split(",");
					eklenecekMap.put(keyValue[0], keyValue[1]);
					
					satir=br.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();//detayli hata raporu verir
			}
		
		return eklenecekMap;
}

}
