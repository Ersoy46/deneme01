package day17_forLoop;

import java.util.Scanner;

public class C02_Forloop {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir String isteyin ve Stringi tesrden yazdırın ?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersden yazdırmak ıcın bir yazi girin.....");
		
		String str=scan.nextLine();
		
		//cekoslavakyalilastıramadıklarımızdanmisiniz
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.substring(i,i+1));
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
