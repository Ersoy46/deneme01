package day12_StringManupulotion;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Lutfen bir cumle giriniz");
	
	String cumle=scan.nextLine();
	
	
	
	
	
	if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
		
		System.out.println("kucuk mu buyuk mu karar ver artık");
		
		
	} else if(cumle.toLowerCase().contains("kucuk")){
System.out.println(cumle.toLowerCase());

		
	}else if (cumle.toLowerCase().contains("buyuk")) {
	System.out.println(cumle.toUpperCase());	
		
	} else {
System.out.println("Cumle kucuk ya da buyuk  harf  icermiyor");

	}
		
		
scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
