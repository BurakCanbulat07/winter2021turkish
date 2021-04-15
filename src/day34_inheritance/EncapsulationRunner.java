package day34_inheritance;

public class EncapsulationRunner {
	
	public static void main(String[] args) {
		Encapsulation obj1=new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		obj1.setOkulIsmi("Mehmet Koleji");
		System.out.println(obj1.getOkulIsmi());
		obj1.setOkulHesapNo(54321);
		System.out.println(obj1.getOkulHesapNo());
		obj1.setOkulAcikMi(false);
		System.out.println(obj1.isOkulAcikMi());
	}

}
