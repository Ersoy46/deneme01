package day17_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		//Kullanıcıdan 10'dan kucuk bir tamsayı isteyin ve 
		//girilen sayının faktoryel'ini bulun (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		System.out.print(sayi + "!=");
		int faktoryel=1;
		
		for (int i = sayi; i >1; i--) {
			
			faktoryel*=i;
			System.out.print(i + "*");
		}
		System.out.println("1=" +faktoryel);
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
