package day08_İfElseStatement;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayı yazınız \n ilk sayıdan sonra diger sayı icin enter'a basınız");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("sayıların toplamı : " + (sayi1 + sayi2));
		} 	else if(sayi1<0 && sayi2<0) {

			System.out.println("sayıların carpimi :" + sayi1 *sayi2);
		
		} else if(sayi1*sayi2<0) {
		
			System.out.println("farkli isaretlerde sayilarla islem yapamazsın");
			
			
		} else {
			System.out.println("sifir carpmaya yutan elemandır");
		}

		
	scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
