package day09_NestedIfElse;

import java.util.Scanner;

public class C02_nestefIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamaklı bir sayi girin");
		
		int sayi=scan.nextInt();
		
		if (sayi<1000 ||sayi>9999) {
			
			System.out.println("4 basamaklı sayi girmelisiniz");
			
		} else {

			if (sayi%5==0) {
		if (sayi%10==0) {
	 System.out.println("5'e tam bölünen cift sayi");
			
		} else {

			System.out.println("5'e tam bölünen tek sayi");
		}
				
				
			} else {

				System.out.println("Lutfen tekrar deneyiniz");
			}
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
