package day20_scope;

import java.util.Scanner;

public class if_elseörnekler {

	public static void main(String[] args) {
//**********HESAP MAKİNASİ ÖRNEGİ**********
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen işleminizi seciniz");
		System.out.println("1-TOPLAMA\n2-CIKARMA\n3-CARPMA\n4-BÖLME");
		int sayi1, sayi2, sonuc, secim;
		secim=scan.nextInt();
		System.out.println("LUTFEN İKİ TAM SAYI GİRİNİZ");
		sayi1=scan.nextInt();
		sayi2=scan.nextInt();
		
		
		if (secim==1) {
			sonuc=sayi1+sayi2;
			System.out.println("TOPLAMA İŞLEMİ : " + sonuc);
		} else if (secim==2) {
			sonuc=sayi1-sayi2;
					System.out.println("CIKARMA İŞLEMİ : " + sonuc);		
		} else if (secim==3) {
			sonuc=sayi1*sayi2;
			System.out.println("CARPMA İŞLEMİ : " + sonuc);
		}else if (secim==4) {
			sonuc=sayi1/sayi2;
			System.out.println("BÖLME İŞLEMİ : " + sonuc);
		}
		else {
			
		System.out.println("LUTFEN 1-2-3-4 SAYILARINDAN BİRİNİ GİRİNİZ");
		}
		
		scan.close();
	}

}
