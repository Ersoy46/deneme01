package day16_forloop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		
	//Kullanıcıdan 100'den kucuk bir tam sayı isteyin.
    // 1' den baslayarak girilen sayıya kadar 3'un katı olan sayıları yazdırın...
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100'den kucuk bir sayı giriniz...");
		
		double num=scan.nextDouble();
		int sayi=(int)num;
		
		// sayi negatifse veya tam sayı degilse uyarı verelim
		
		if (num<0) {
			System.out.print("negatif sayı giremezsiniz");
			
		} else if(sayi!=num){
System.out.print("lutfen tam sayı giriniz");

		}else if (sayi>100) {
			System.out.println("lutfen 100'den kucuk sayı giriniz");
		}
		else {
			for (int i = 1; i <=num; i++) {
			if (i%3==0 ) {
				System.out.print(i + ", ");
		}
	
		scan.close();
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


