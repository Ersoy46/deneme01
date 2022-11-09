package day19_whileloop_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {

		//kullanıcıdan bir sayi alin ve bu sayiyi tam bölen
		//sayilari ve toplam kac tane olduklarını ekranda yazdırın....
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bölenlerinin bulmak icin \npozitif bir tam sayigiriniz");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				
				System.out.print(bolen + " ");
			sayac++;
			}
	bolen++;
		}
	System.out.println("");
	
		System.out.println(sayi + " sayisinin " + sayac + " adet tam boleni vardır");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
