package day15_methodCreatıon;

import java.util.Scanner;

public class C01_MethodCreatıon {

	public static void main(String[] args) {
	
	    //kullanicidan ismini soyismini isteyin
	    //iki farklı method oluşturun, methodlardan biri girilen kelimeleri birleştirsin
	    // ilk harf buyuk , digerleri kucuk olacak şekilde birleştirsin 
	    //ikinci method isim ve soyismin ilk harfleri buyuk harf 
		//kalan harfler * olacak şekilDe birleştirsin 
		//kullanıcıya isminin acık olarak yazılması veya gizlenmesi tercihi sorun
		//ve programın kalan kısmında isim ve soyismi kullanıının istedigi şekilde kullanın
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen isim ve soyisminizi giriniz \n isimden sonra enter'a basınız");
	
	String isim=scan.next();
	String soyisim=scan.next();
	
acikİsim(isim,soyisim);
	
	isimGizle(isim,soyisim);
	
	System.out.println("İsminizin acık sekilde yazılmasini istiyorsanız 1 "
	+ "\nılk harf hariç gizli yazılmasını istiyorsanız 2'e basiniz");

	int tercih=scan.nextInt();
	
	String birlesmisIsim=null;
	
	if (tercih==1) {
		birlesmisIsim= acikİsim(isim,soyisim);
		
		
	} else if(tercih==2){

		birlesmisIsim=isimGizle(isim,soyisim);
	}
	else {
		System.out.println("Lutfen 1 veya 2 secin");
	}
	
	System.out.println("Kullanıcı tercihi :  " + birlesmisIsim);
	
	scan.close();
}

	public static String isimGizle(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w", "*");
		
		soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w", "*");
	return  isim + soyisim; 
		
		
		
	}

	public static String acikİsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
			
		return isim+"  "+soyisim;
	}
}