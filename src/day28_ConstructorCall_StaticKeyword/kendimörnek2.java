package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class kendimörnek2 {

	public static void main(String[] args) {

		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
				//		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
				//    	- Girilen kelime cumlede kullanilmamis.
				//		- Girilen kelime cumlede 1 kere kullanilmis.
				//		- Girilen kelime cumlede 1’den fazla kullanilmis.

	Scanner scan=new Scanner (System.in);

	System.out.println("Lutfen bir cumle giriniz");
		
	String cumle=scan.nextLine();
	
	System.out.println("Lutfen kelime  giriniz");
	
		String kelime=scan.next();
	
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			System.out.println("cumlede  : " + kelime + " YOK");
		}  
		else if (cumle.indexOf(kelime, index+1)==(-1)) {
			System.out.println("bir defa");
		}
		else
			System.out.println("fazla");
	}

}
