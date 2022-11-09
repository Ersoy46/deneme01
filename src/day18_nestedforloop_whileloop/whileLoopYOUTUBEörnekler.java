package day18_nestedforloop_whileloop;

public class whileLoopYOUTUBEörnekler {

	public static void main(String[] args) {
		
        //WHİLE DÖNGÜSÜ İLE YAPACAGIZ 
		//1'den 10'a kadar olan sayilari yazdir
		//1'DEN 10'a kadar olan cift sayilari yazdır
		//1'den 10' a kadar olan tek sayıları yazdır
		//1'den 10'a kadar cift olan sayilarin toplamını yazdır
		//1'den 10'a kadar olan tek sayilarin toplamını yazdır
		
	//CEVAP (2)
	
		int i=1;
		while (i<=10) {
			if (i%2==0) {
				System.out.print(i + " ");
			}		
			i++;
		}
		System.out.println("");
		
		//////cevap 3 
		int a =1;
		while (a<=10) {
			if (a%2==1) {
				System.out.print(a + " ");
			}		
			a++;
		}
		System.out.println("");
	//	cevap 4
		int toplam=0;
		int b=1;
		while (b<=10) {
			if (b%2==0) {
			toplam+=b;
			
			}
			b++;
		}
		System.out.println("cift sayiların toplamı : " + toplam);
		
		System.out.println("");
		
		//cevap 5 
		
		
		int toplam1=0;
		int c=1;
		while (c<=10) {
			if (c%2==1) {
			toplam1+=c;
			
			}
			c++;
		}
		System.out.println("tek sayiların toplamı : " + toplam1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
