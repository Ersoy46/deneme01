package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class örnekforloop7 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	
		System.out.println("faktoryel için sayi girin");
		
		int sayi=scan.nextInt();
		
		int faktoryel=1;
		
		for (int i = sayi; i>=1; i--) {
			
			faktoryel*=i;
			System.out.print(i +"*");
		}
	
	System.out.println("=" + faktoryel);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
