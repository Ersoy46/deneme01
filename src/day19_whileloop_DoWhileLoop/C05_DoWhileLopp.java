package day19_whileloop_DoWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLopp {

	public static void main(String[] args) {

		//kullanıcıdan bir sifre girmesini isteyin
		//girilen sifreyi asagidaki sartlara göre kontrol edin
		//ve sifredeki hataları yazdırın
		//kullanıcı gecerli bir sifre girinceye kadar bu islei tekrar edin ve gecerli sifre girdiginde  "sifreniz kabuk edilmistir"
		// - sifre kucuk harf icermelidir
		//-sifre buyuk harf icermelidir
		//-sifre ozel karakter icermelidir
		//sifre en az 8 karakter olmalıdır.....
		
		

		Scanner scan=new Scanner(System.in);
		String sifre="";
		boolean khk=false;
		boolean bhk=false;
		boolean ozk=false;
		boolean uk=false;
		
		do {
			System.out.println("Lutfen bir sifre giriniz");
			sifre=scan.nextLine();
			
			
			
		   khk= kucukharfkontrol(sifre);
			bhk=buyukharfkontrol(sifre);
		   ozk=ozelkarakter(sifre);
			uk=uzunlukkontrol(sifre);
			
		} while (!khk || !bhk || !ozk || !uk);
		
		
		System.out.println("sifreniz basarılı bir sekilde kaydedildi");
		
		
	
		
	}

	private static boolean uzunlukkontrol(String sifre) {
		boolean uk=false;
		if (sifre.length()>=8) {
		uk=true;
		
		}else {
		System.out.println("sifreniz en az 8 karakter icermelidir");
		}
		return false;
	}

	private static boolean ozelkarakter(String sifre) {
		boolean ozk=false;
		String harfler="@*/-+!'^+%&/()=?_<>,";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i++))) {
			ozk=true;
			break;
			
			}
		}
	if (!ozk) {
		System.out.println("Sifreniz en az bir ozel karakter icermelidir");
	}
		return ozk;		
		
	}

	private static boolean buyukharfkontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIJKLMNOPRSTUVYZQWX";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i++))) {
			bhk=true;
			break;
			
			}
		}
	if (!bhk) {
		System.out.println("Sifreniz en az bir buyuk harf icermelidir");
	}
		return bhk;
		
	}

	private static boolean kucukharfkontrol(String sifre) {
	boolean khk=false;
		String harfler="abcdefghijklmnoprstuvyzqwx";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i++))) {
			khk=true;
			break;
			
			}
		}
	if (!khk) {
		System.out.println("Sifreniz en az bir kucuk harf icermelidir");
	}
		return khk;
	}

}
