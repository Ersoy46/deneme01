package day18_nestedforloop_whileloop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		//kullanicidan toplamak üzere sayi isteyin
		//kullanici 0' basıncaya kadar sayilari alıp toplamaya devam edin
		//kullanıcı 0'a bastıgında, o ana kadar kaca sayi girdigini 
		//ve girilen sayiların toplamını yazdırın...
		
		//kullanıcıdan 5 sayi alın derse
		
		for (int i = 1; i <=5; i++) {
			//kullanıcıdan bir deger alıp,toplama eklerim.
		}
		//kac sayi istedigi belli degilse
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=1;          //0'ın dısında ne yazarsak olur 0 olmaz.
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			System.out.println("Lutfen toplama eklemek icin bir tam sayi yazın \n bitirmek icin 0'a basın");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		//kullanıcı 0'a bastıgında loop islevini son kez yapıp sonra basa donecek ve loop bitecek.
		//0toplanmak uzere verilmeyip sadece bitirmek icin verildiginden 
		//sifiri sayaca'a eklemememk icin 38.satırda sayac-1 yaptık........
		
		System.out.println("girilen sayi adedi :" + (sayac-1));
		System.out.println("girilen sayıların toplamı :" + toplam);
		
		
		
		scan.close();
		
		
		

	}

}
