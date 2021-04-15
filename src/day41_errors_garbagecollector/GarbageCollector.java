package day41_errors_garbagecollector;

public class GarbageCollector {
	
	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		//bu kod calistiginda kac tane obje olusur
		//1001
		//ilk basta 1 tane olusturduk
		//sonra her dongude str a concatination yapilacak
		//ama String class i immutable oldugu icin her yeni degeri koymak icin
		//yeni bir String objesi olusturulur ve eski obje pointerdan silinir
		
		//dolayisiyla loop bittiginde str icin 1 tane pointer in isaret ettigi obje,
		//1000tane de hicbir pointerin isaret etmedigi obje heap memory de bulunur
	}

}
