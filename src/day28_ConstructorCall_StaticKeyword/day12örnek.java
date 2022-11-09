package day28_ConstructorCall_StaticKeyword;

import java.util.Scanner;

public class day12örnek {

public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
			
	System.out.println("lutgen bir cumle giriniz hemen");
	
	String cumle=scan.nextLine();
	System.out.println("Lutfen bir kelime giriniz hemen hemen ");
	
	String kelime=scan.next();
	
	if (cumle.startsWith(kelime)) {
		System.out.println("girilen cumle : " + kelime +  " ile baslıyor");
		
	}else {
		System.out.println("girilen cumle : " + kelime + "ile baslamıyor");
	}
	
	if (cumle.endsWith(kelime)) {
		System.out.println("girilen cumle : " + kelime + "ile bitiyor");
	} 
	else {
System.out.println("girilen cumle : " + kelime + " ile bitmiyor");
	}
	
	scan.close();
	
	
	
	
}
}
