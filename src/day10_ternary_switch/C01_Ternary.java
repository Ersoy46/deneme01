package day10_ternary_switch;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen diger bir sayi giriniz");
		
		double sayi2 =scan.nextDouble();
				
				
				System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		
		scan.close();
		
		
		
		
		
		
		
		
	
	}

}
