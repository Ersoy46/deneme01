package day12_StringManupulotion;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Lutfen mail adresinizi giriniz");
	
	String email=scan.next();
	
	int uzunluk =email.length();
	
	int index=email.lastIndexOf("@gmail.com");
	
	
	if (!email.contains("@gmail.com")) {
	
		System.out.println("Lutfen mail adresini tekrar giriniz yanlıs oldu");
		
		
	} else if(index==uzunluk-10){

		System.out.println("Email adresi kaydedildi tamamdır");
	}
	else {
		System.out.println("Lutfen yazımı kontrol edin");
	}
	
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
