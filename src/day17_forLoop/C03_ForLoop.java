package day17_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		
		//Kullanıcıdan bir Stringisteyin ve Stringi tersine ceviren bir method yazın ?
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersden yazdırmak ıcın bir yazi girin.....");
		
		String str=scan.nextLine();

		
		
		
		System.out.println(tersineCevir(str));
		
		
		
		scan.close();
		
	}

	private static String tersineCevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
		
			tersStr+=str.substring(i, i+1);
		
		}
		return tersStr;
	}
	

}
