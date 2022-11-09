package day17_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		//Kullanıcıdan iki sayi isteyin
		//girilen sayilar ve aralarındaki tüm sayikarı toplayıp
		//sonucu yazdıran bir program yazdırın....
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen aradaki sayilari toplamak icin iki tam sayı giriniz.....");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
	
		int buyuk=0;	
		int kucuk=0;
		
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
					
		} else {
            buyuk=sayi2;
  
            kucuk=sayi1;
		}
		
		int toplam=0;
	
		for (int i = kucuk; i <= buyuk; i++) {
			
			toplam+=i;
			
		}
		
		System.out.println("girilen sayılar ve aralarındaki sayıların toplamı :" +toplam);
		
		scan.close();	

		
		
		
		
		
		

	}

}
