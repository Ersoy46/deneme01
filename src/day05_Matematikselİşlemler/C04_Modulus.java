package day05_Matematikselİşlemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 3 basamaklı sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		

		rakamlarToplami=0;
		 rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		

		rakamlarToplami=0;
		 rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println(rakamlarToplami);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
