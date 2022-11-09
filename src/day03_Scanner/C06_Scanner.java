package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		
		// Scanner isleminde String icin 2 method vardir
		//scan.next() dedigimizde sadece 1 kelime alir 
		//eger kullanıcıdan daha fazla kelime gelme ihtimali varsa 
		//scan 

		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz..args.");
		
		String soyisim=scan.nextLine();
		System.out.println("girilen isim :" + isim + "" + soyisim);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
