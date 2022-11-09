package day18_nestedforloop_whileloop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		
		//For Loop ve while loop kullanarak 3 basamaklı sayılardan 
		//15, 20, ve 90 a tam bolunebilen sayiları yazdırın.....
		
		for (int i = 100; i <1000; i++) {
		
		if (i%15==0 && i%20==0 && i%90==0) {
			
			System.out.println(i);
			
		}
		}
		
		int sayi=100;
		while (sayi<1000) {
		
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				

			System.out.println(sayi);
			
		}
		sayi++;	
		}	
		// Eger baslangıc ve bitis sarti bir sayinin artisina baglı ise veya 
		//tekrar edilecek islem adedi belli ise for loop tercih edilir...
		//islem tekrar sayisi belli degil ise veya 
		//bitis icin bir sinir degerinden buyuk olma sart varsa while loop tercih edilir. 
	}

}
