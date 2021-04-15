package day21_scope;

public class Scope6 {
	public int num1;
	String name = "Ali";
	public static void main(String args){ 
	  add();
	//product (5); static olmayan bir method static olan main method icerisinden cagirilamaz
	}
	public static void add(){
	//num1 ++;//static olmayan num1, static bir method icinden kullanilamaz
	@SuppressWarnings("unused")
	int num2 = 6;
	@SuppressWarnings("unused")
	char letter;
	System.out.println("Do addition ");
	}
	public void product(int num3){
	name = "Veli";
	//num2++;// num2 ustteki method da olusturulmus local bir variable dir.
	System.out.println(num3 * num3);
	} }

