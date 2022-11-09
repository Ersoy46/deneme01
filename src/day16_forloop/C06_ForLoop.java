package day16_forloop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		//Kullanıcıdan 100'den kucuk bir tamsayı isteyin
		//1'den baslayarak girilen sayıya kadar 3'un veya 5'ın katı olan sayıları yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lUTFN 100'DEN KUCUK BİR TAMSAYI GİRİNİZ");
		double num=scan.nextDouble();
		int sayı=(int)num;
		
		if (num<0) {
			System.out.print("negatif sayı girme lan dürrük");
			
		} else if(num>100) {
		System.out.print("100 den kucuk sayı gir lan dürrük");
		}
		else if(sayı!=num) {
		System.out.print("lutfen tamsayı giriniz");
		}
		else 
			for (int i = 1; i <=num; i++) {
			if (i%3==0 || i%5==0) {
				
		// modulus burada kulalnıldı..	
			
				System.out.print(i + ", ");	
			}
		}
		
	scan.close();
		
		

	}

}
