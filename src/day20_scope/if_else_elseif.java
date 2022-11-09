package day20_scope;

import java.util.Scanner;

public class if_else_elseif {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("LUTFEN NOTUNUZU GİRİNİZ");
		
		
int i=scan.nextInt();
		if (i>90 && i<=100) {
			System.out.println("AA");
		} else if (i>80 && i <=90) {
			System.out.println("BB");
		}else if (i>70 && i<=80) {
			System.out.println("CC");
		}else if (i<=70) {
			System.out.println("kaldın gerizekalı");
		}else {
			System.out.println("lutfen 1 ile 100 arasında bir sayı giriniz");
			System.out.println("lutfen 5 ile 5000 arasında bir sayı giriniz");
			System.out.println("lutfen 100 ile 90 arasında bir sayı giriniz");
		}
		
		
		scan.close();
		
		
		
		
		
		
	}

}
