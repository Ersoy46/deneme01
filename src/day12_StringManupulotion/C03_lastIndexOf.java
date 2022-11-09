package day12_StringManupulotion;

import java.util.Scanner;

public class C03_lastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varııgını kontrol etmek icin bir harf giriniz");
		char krk=scan.nextLine().charAt(0);
		
		int index=cumle.lastIndexOf(krk);
		if (index==-1) {
		System.out.println("hARF CUMLEDE KULLANILMAMIAS");
		
		}else {
			System.out.println("hARF CUMLEDE KULLANILMIS");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
