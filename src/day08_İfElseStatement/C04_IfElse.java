package day08_İfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen ücgenin kenar uzunluklarini giriniz \n ilk kenarı girdikten sonra  \n diger kenarları giriniz");
		
	double kenar1=scan.nextDouble();
	double kenar2=scan.nextDouble();	
	double kenar3=scan.nextDouble();
		
	if (kenar1==kenar2 && kenar2==kenar3) {
		System.out.println("Eskenar ucgen");
	} else {
System.out.println("Eskenar ucgen degil");
	}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
