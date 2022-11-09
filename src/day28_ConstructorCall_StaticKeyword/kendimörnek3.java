package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class kendimörnek3 {

	public static void main(String[] args) {

	//  Soru 1) Kullanicidan email adresini girmesini isteyin, 
			//         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
			//         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
			//         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
		
		Scanner scan=new Scanner (System.in);

		System.out.println("Lutfen mail giriniz");
	
		String email=scan.next();
		
		int uzunluk=email.length();
		int index=email.lastIndexOf(uzunluk);
		
		if (!email.contains("@gmail.com")) {
			System.out.println("yok");
		}else if (index==uzunluk-10) {
			
			System.out.println("kaydedildi");
			
		}else {
			System.out.println("kontrol");
		}
		
		
		
		
	}

}
