package day26_ForEachLoop_Constructor;

import java.util.Scanner;

public class örnek {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir harf giriniz");
		
	char krk=scan.next().charAt(0);
	
	if (krk>='a' && krk<='z') {
		
		System.out.println("kucuk harf girdiniz");
		
	} else if (krk>='A' && krk<='Z') {
		
		System.out.println("BUYUK HARF GİRDİNİZ");
		
	} else {
		System.out.println("girdiginiz karkaker harf degil");
	}
	{

	}
		
		scan.close();
		
		
		
		
	}

}
