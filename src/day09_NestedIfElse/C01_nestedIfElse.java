package day09_NestedIfElse;

import java.util.Scanner;

public class C01_nestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {
	
			if (ilkKarakter=='A') {
				System.out.println("Gecerli Sİfre");		
		
			} else {

				System.out.println("Gecersiz Sİfre");
			}
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z') {
 
			if (ilkKarakter=='z') {
		
				System.out.println("Gecerli Sİfre");
			} else {
				System.out.println("Gecersiz Sİfre");
			}
			
		} else {
			
			System.out.println("sifre gecerli olması icin harf ile baslayiniz");
			
		}
		
		
	scan.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
