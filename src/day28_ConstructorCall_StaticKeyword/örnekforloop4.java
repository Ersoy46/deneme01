package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class örnekforloop4 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
	
		System.out.println("lutfen 100 den kucuk bir sayi giriniz");
		
		double num=scan.nextDouble();
		int sayi=(int) num;
		
		
		for (int i = 1; i < num; i++) {
			
			if (i%3==0) {
				
				System.out.print(i + " , ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
