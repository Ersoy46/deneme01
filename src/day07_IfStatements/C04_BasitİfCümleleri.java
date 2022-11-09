package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitİfCümleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdörtgenin bir kenar uzunlugunu giriniz");
		double kenar1=scan.nextDouble();
		
		
		System.out.println("Lutfen dikdörtgenin diger kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdörtgen kare");
		}
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdörtgen kare degil");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
