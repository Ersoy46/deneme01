package day26_ForEachLoop_Constructor;

import java.util.Scanner;

public class ÖRNEKLEM {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		
	System.out.println("Lutfen bir tamsayi giriniz");
	
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	System.out.println("Lutfen diğer sayiyi giriniz");
	

	
	System.out.println(sayi1>sayi2 ? sayi2: sayi1);
		
		scan.close();
		
	}

}
