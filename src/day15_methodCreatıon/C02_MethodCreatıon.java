package day15_methodCreatıon;

import java.util.Scanner;

public class C02_MethodCreatıon {

	public static void main(String[] args) {
		

		//Kullanıcıya kac sayı toplamak istedigini sorun
		//Kullanıcı 2,3, veya 4 degerini girerse ,
		//Kullanıcıdan bu sayıları girmesini isteyin
	    //	ve sayıların toplamını yazdırın 
		//Kullanıcı toplamak istedigi sayı adetini 4'den buyuk girerse 
		//cok sayı girdiniz, ben toplayamam yazdırın 
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen toplamak istediginiz sayı adetini 2,3 veya 4 den biri olarak secin ");
		
		int tercih=scan.nextInt();
		
		if (tercih>4) {
			tercih=5;
		}
		
		
		switch(tercih) {
		
		case 2: 
			ikiSayiTopla();
			
			break;
			
		case 3:
			ucSayiTopla();
			
			break;
		case 4 :
		
			dortSayiTopla();
		
			break;
		
		case 5 :
		
			System.out.println("cok sayi girdiniz, ben toplayamam");
		
			break;
			
		default:
				
				System.out.println("gecersiz tercih");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void dortSayiTopla() {
		Scanner scan =new Scanner (System.in);	
		System.out.println("Lutfen dort sayi girin \n her sayidan sonra enter'a basınız ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("girdiginiz dort sayinin toplamı : " + (sayi1+sayi2+sayi3+sayi4));
		
		
	}

	private static void ucSayiTopla() {
		Scanner scan =new Scanner (System.in);	
		System.out.println("Lutfen uc sayi girin \n her sayidan sonra enter'a basınız ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("girdiginiz uc sayinin toplamı : " + (sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla() {
	
		Scanner scan =new Scanner (System.in);	
		System.out.println("Lutfen iki sayi girin \n her sayidan sonra enter'a basınız ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girdiginiz iki sayinin toplamı : " + (sayi1+sayi2));
		
	}

}
