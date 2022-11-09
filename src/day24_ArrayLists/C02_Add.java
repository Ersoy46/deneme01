package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> isimler=new ArrayList<>();
		
		System.out.println("Bos liste : " + isimler);
		
		isimler.add("Ali");
		
		System.out.println("Bir Eleman : " + isimler);
		
		isimler.add("Veli");
		
		System.out.println("iki eleman : " + isimler);
		
		//add methodu listenin sonuna ekleme yapar....
		
		isimler.add("Ertuğrul");
		
		System.out.println("Üc Eleman : " + isimler);
		
		
		//sona degilde araya eklemek istersek eger
		
		isimler.add(1, "Halime");
		System.out.println("birinci indexe Halime eklendi : " + isimler);
		
		
	//	isimler.add(5); declare ederken belirttigimiz data turu dısında bir data turunden ekleme yapamayız....
		
	List<String> liste2=new ArrayList<>();
	
	liste2.add("Gunter");
	liste2.add("emrah");
	
	System.out.println("liste2 : " + liste2);
		
	isimler.addAll(4, liste2);
	System.out.println("liste2 yi ekledik : " + isimler);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
