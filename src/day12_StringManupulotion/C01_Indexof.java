package day12_StringManupulotion;

import java.util.Scanner;

public class C01_Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Lutfen bir cumle giriniz");
	
	String cumle =scan.nextLine();
	System.out.println("Lutfen varlıgını kontrol etmek icin bir harf giriniz");
	
	char krk=scan.nextLine().charAt(0);
	
	int index=cumle.indexOf(krk);
	if (index==0) {
		System.out.println("Girdiginiz harf cumlede yok");
	} else {
		System.out.println("Girdiginiz harf cumlede var");
	}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
