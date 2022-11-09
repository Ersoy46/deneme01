package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class örnekforloop5 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
        System.out.println("100 den kucuk sayi gir lan");
 
        double num=scan.nextDouble();
        int sayi=(int) num;
        
        if (num<0) {
			System.out.println("negatif sayi girme lan");
		}else if (sayi!=num) {
			System.out.println("tam sayi girmen gerekli");
		}else if (num>100) {
			System.out.println("100 den buyuk sayi girme lan");
		}else {
			
		}
			
		for (int i = 1; i < num; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i + " ,");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
