package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class kendimörnek {

	public static void main(String[] args) {

		// Kullanicidan bir cumle ve bir harf isteyin, 
				// harfin cumlede var olup olmadigini yazdirin
		

		Scanner scan=new Scanner(System.in);
		System.out.println("cumle gir");
		
		String cumle=scan.nextLine();
		System.out.println("harf gir");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);
		
		if (index==(1)) {
			System.out.println("var");
			
		}else {
			System.out.println("yok");
		}
		
		
		
		
	}

}
