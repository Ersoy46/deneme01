package day12_StringManupulotion;

import java.util.Scanner;

public class C02_IndexOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		System.out.println("Lutfen varlıgını kontrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int index=cumle.indexOf(kelime);
	
	if (index<0) {
		System.out.println("Girilen kelime cumlede kullanılmamıs");
	
	}else if (cumle.indexOf(kelime, index+1)<0) {
		System.out.println("Girilen kelime 1 defa kullanılmıs");
		System.out.println("Girilen kelime .... defa kullanılmıs");
		
		}else {
			
			System.out.println("Girilen kelime 1 den fazla kullanılmıs");
		}
	
			
	
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
