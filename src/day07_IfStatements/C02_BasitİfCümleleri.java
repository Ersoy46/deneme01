package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitİfCümleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir tam sayi giriniz");
		
	int sayi = scan.nextInt();
	
	if (sayi%2==0) {
		System.out.println("girdiginiz sayi cift sayi");
		
	}
		if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek sayi");
		}
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
