package day17_forloop;
import java.util.Scanner;
public class C1_ForLoop1 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        
        if (sayi<=0) {
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        } else {
            rakamlarToplamiYazdir(sayi); 
        }
        scan.close();
        
    }
    public static void rakamlarToplamiYazdir(int sayi) {
        int rakamlarToplami=0;
        String sayi2=sayi+""; // sayi1'i String'e cevirdik
        
        for (int i = 0; i < sayi2.length(); i++) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println("rakamlar toplami : " + rakamlarToplami);
    }
}