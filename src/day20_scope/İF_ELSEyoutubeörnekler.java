package day20_scope;

import java.util.Scanner;

public class İF_ELSEyoutubeörnekler {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isleminizi seciniz");
		System.out.println("1-Toplam\n2-Cıkarma\n3-Carpma\n4-Bölme");
		int sayi1  , sayi2  , sonuc, secim;
		
		secim=scan.nextInt();
		System.out.println("LUTFEN İKİ TAM SAYI GİRİNİZ");
		sayi1=scan.nextInt();
		sayi2=scan.nextInt();
		
		
		if (secim==1) {
			sonuc=sayi1+sayi2;
			System.out.println("toplama sonucu : " + sonuc);

			
		} else if (secim==2) {
			sonuc=sayi1-sayi2;
			System.out.println("cıkarma sonucu : " + sonuc);
		} 
		else if (secim==3) {
			sonuc=sayi1*sayi2;
			System.out.println("carpım sonuc : " + sonuc);
		}
			else if (secim==4) {
				sonuc=sayi1/sayi2;
				System.out.println("bölme sonucu : " + sonuc);
			}	
			
			else {
				System.out.println("LUTFEN 1-2-3-4 SAYILARINDAN BİRİNİ GİRİNİZ");
			}
		
		
		
		
		scan.close();
		
		
		
	}

}
