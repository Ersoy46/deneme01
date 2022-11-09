package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class örneklerdayc01 {

	public static void main(String[] args) {
		
		// kullanicidan ismini ve soyismini isteyin
				// iki farkli method olusturun methodlardan biri girilen kelimeleri 
				//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
				// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
				//   kalan harfler * olacak sekilde birlestirsin
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
				// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("LUTFEN İSİM,SOYİSİM GİRİNİZ");
		
		String isim=scan.next();
		String soyisim=scan.next();

		acıkİsim(isim,soyisim);
		gizliİsim(isim,soyisim);
		
		System.out.println("isminizin acık yazılmasını istiyorsanız : 1 \nkapalı yazılmasını istiyorsanız 2 tusuna basın lutfen");
		
		int tercih=scan.nextInt();
		String birlesmisİsim=null;
		
		switch(tercih) {
		case 1:
			birlesmisİsim=acıkİsim(isim,soyisim);
			break;
		case 2 :
			birlesmisİsim=gizliİsim(isim,soyisim);
			break;
			
		default :
		System.out.println("lutfen 1 ve 2 tuslarından birisine basınız");
		}
		System.out.println("kullanıcının tercigi : " + birlesmisİsim);
		
	}

	public static String gizliİsim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		return isim + " " + soyisim;
	}

	public static String acıkİsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim + " " + soyisim;
	}
}