package day13_StringManupulation;

import java.util.Scanner;

public class C01_StartWith_EndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen kelime giriniz");
		

		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
	
			System.out.println("girilen cumle " + kelime + " ile baslıyor" );
			
			
		} else {
			System.out.println("girilen cumle " + kelime + " ile baslamıyor" );
			
			
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
			
		} else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
