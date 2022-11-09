package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class örnekler {

	public static void main(String[] args) {

		/* Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
    	 Kullanici 2,3 veya 4 degerini girerse, 
	     kullanicidan bu sayilari girmesini isteyin 
	     ve sayilarin toplamini yazdirin. 
         Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
	     “Cok sayi girdiniz, ben toplayamam” yazdirin.
        */
 		
	Scanner scan=new Scanner (System.in);
	
	System.out.println("lutfen kac sayi toplamak istediginizi giriniz\n2,3 ve 4 sayilarını giriniz");
	
	int tercih=scan.nextInt();
	
	if (tercih>4) {
		tercih=5;
	}
	switch (tercih) {
	case 2:
		ikiSayiTopla();
		break;
	case 3 : 
		ücSayiTopla();
		break;
	case 4: 
		dörtSayiTopla();
		break;
	case 5:
		System.out.println("cok sayi girdiniz ben toplayamam");
		default:
			System.out.println("2,3,4 sayılarından birini girsene lan ");
		
	}

		
		
		
		
		
	}

	private static void dörtSayiTopla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("dört sayi gir lan");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("girdigin sayilarin toplamı : " + (sayi1+sayi2+sayi3+sayi4));		
	}

	private static void ücSayiTopla() {
	Scanner scan=new Scanner (System.in);
	System.out.println("üc sayi gir lan");
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	double sayi3=scan.nextDouble();
	
	System.out.println("girdigin sayilarin toplamı : " + (sayi1+sayi2+sayi3));
	}

	private static void ikiSayiTopla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("iki sayi gir lan");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("iki sayi toplamı : " + (sayi1+sayi2));
	}

}
