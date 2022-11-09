package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner02 {

	public static void main(String[] args) {
		
		
		//Kullanıcıdan isim ve soyismini ayri ayri isteyip 
		//girilen ismi asagıdaki gibi yazdiriniz.
        
		// girilen isim : Ertugrul Ersoy
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz..args.");
		
		String soyisim=scan.next();
		System.out.println("girilen isim :" + isim + "" + soyisim);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
