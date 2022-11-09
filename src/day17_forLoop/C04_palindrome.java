package day17_forLoop;

import java.util.Scanner;

public class C04_palindrome {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir Stringisteyin
	//Kullanıcınon girdigi String'in palindrome olup olmadıgını kontrol eden bir program yazın
	

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersden yazdırmak ıcın bir yazi girin.....");
		
		String str=scan.nextLine();
	
	
	if (str.equals(tersineCevir(str))) {
	System.out.println("Girdiginiz String palindrome");	
	}
	
	else {
		System.out.println("Girdiginiz String Palindrome degil");
	}
	
	
	
	
	
	
	scan.close();
	
	
	
	}

	private static Object tersineCevir(String str) {
		// TODO Auto-generated method stub
		return null;
	}



}
