package day26_ForEachLoop_Constructor;

import java.util.Scanner;

public class örnekklkkk {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		switch (sayi) {
		
		case 10 : 
			System.out.println("iki basamaklı en kücük sayi");
			break;
		case 100 : 
			System.out.println("üc basamaklı en kücük sayi");
			break;
		case 1000 : 
			System.out.println("dört basamaklı en kücük sayi");
			break;
			default : 
				System.out.println("girdigin sayıyı değiştir");
			
			
		}
		
		
		scan.close();
		
		
		
	}

}
