package day18_nestedforloop_whileloop;

import java.util.Iterator;

public class forLoopYOUTubeÖRNEKLER {

	public static void main(String[] args) {
		
		//1'den 10'a kadar olan sayilari yazdir
		//1'DEN 10'a kadar olan cift sayilari yazdır
		//1'den 10' a kadar olan tek sayıları yazdır
		//1'den 10'a kadar cift olan sayilarin toplamını yazdır
		//1'den 10'a kadar olan tek sayilarin toplamını yazdır
		
	//CEVAP (1)
		
		for (int i = 1; i <=10; i++) {
			
			System.out.print(i + " ");
		}
		System.out.println("");
		
	//	CEVAP (2)
		
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {
				
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		//CEVAP (3)
		
		for (int i = 1; i <=10; i++) {
			
			if (i%2==1) {
				System.out.print(i +" ");
			}
		}
		
		System.out.println("");
		
		//CEVAP (4)
		
		int toplam=0;
		
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				toplam+=i;
				
			}
		}
		System.out.print("sonuc cift sayi : " +toplam);
		
		System.out.println("");
		
		//CEVAP (5)
		for (int i = 1; i<=10; i++) {
			
			if (i%2==1) {
				toplam+=i;
				
			}
		}
		System.out.print("sonuc : " + toplam);
	
		System.out.println("");
		
		//1'den 20'e kadar yazdır cift sayilarin yerine ENES yazdır degilse i'nin degerinin yazdır
		
		for (int i = 1; i <=20; i++) {
			
			if (i%2==0) {
				System.out.print("ENES " );
			}
		
		else {
			System.out.print(i + " ");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
