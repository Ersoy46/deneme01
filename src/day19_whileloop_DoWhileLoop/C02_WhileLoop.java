package day19_whileloop_DoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {

		//kullanıcıdan bir sayi alin ve
		//sayinin rakamlarının toplamini yazdırın

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin \npozitif bir tam sayigiriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
	
		while (sayi>0) {
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		}
		
	System.out.println("gidiginiz sayinini rakakmlar toplamı :" + rakamlarToplami);
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
