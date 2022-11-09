package day08_İfElseStatement;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen maas teklifinizi giriniz");	
			
		double teklif=scan.nextDouble();
		
		
		
		if (teklif>80.000) {
			System.out.println("Kabul ediyorum");
		} else if(teklif>=60.000){
System.out.println("Konusabiliriz");

		} else {
		System.out.println("Malesef kabul edemem");	
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
