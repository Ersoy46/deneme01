package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitİfCümleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen gun ismini giriniz");	
		String gun= scan.next().toLowerCase();
		
		if (gun.equals("pazar") ||  gun.equals("cumartesi")) {
			System.out.println("Hafta Sonu");
		}
		
	if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("Çarsamba") || gun.equals("perşembe") ||gun.equals("cuma")) {
		System.out.println("Hafta ici");
	}
			
	
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
