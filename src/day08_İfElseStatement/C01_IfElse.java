package day08_İfElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
		System.out.println("Lutfen dikdörtgenin bir kenan uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdörtgenin diger kenan uzunlugunu giriniz");
		 
		double kenar2=scan.nextDouble();
				
				if (kenar1==kenar2) {
					System.out.println("girilen olculer karedir");
				} else {
					System.out.println("girilen olculer kare degildir");

				}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
