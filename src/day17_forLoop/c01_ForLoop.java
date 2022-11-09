package day17_forLoop;

import java.util.Scanner;

public class c01_ForLoop {

	public static void main(String[] args) {
		
		//Kullanıcıdan 100'den kucuk bir tam sayı isteyin.
		//1'den baslayarak girilen sayıya kadar tum sayıları yazdırın.
		// ANCAK;
		//Sayı 3'un katı ise sayı yerine "Java" yazdırın
		//Sayı 5'in katı ise sasyı yerine "Guzeldir" yazdırın
		//Sayı hem 3'un hem 5'ın katı ise sayı yerine "Java Guzeldir" yazdırın.
				
				
				Scanner scan=new Scanner(System.in);
				System.out.println("lUTFN 100'DEN KUCUK BİR TAMSAYI GİRİNİZ");
				int num=scan.nextInt();

				for (int i = 1; i <=num; i++) {
			
				}
			if (num%3==0 && num%5==0) {
				System.out.println("JAVA GUZELDİR");
				
			} else if(num%3==0){
              System.out.println("JAVA");
			}		
			else if(num%5==0) {
				System.out.println("GUZELDİR");
			}
			else {
				System.out.println("num");
			}

			
			
			
			
			
			scan.close();
	}

}
