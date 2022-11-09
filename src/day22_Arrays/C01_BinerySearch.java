package day22_Arrays;

import java.util.Arrays;

public class C01_BinerySearch {

	public static void main(String[] args) {

		String isimler[]= {"HACER", "AİNAGUL", "EMİNE", "MURAT", "KUTLU"};
		
		//isimler array'inde Murat ismi varmı?
		
		//array'de arama yapmadan önce sıralama yapmalıyız...
	
		Arrays.sort(isimler);
		
		//Array class'i ile sort yaptıgımızda array'imşz kalici olarak degişir..
		
		
		System.out.println(Arrays.toString(isimler));
	
		
		System.out.println(Arrays.binarySearch(isimler, "MARAT"));
		
		//OLMAYAN BİR ARRAY ARATIRSAK İSE ŞU ŞEKİLDE OLUR
		
		System.out.println(Arrays.binarySearch(isimler, "MEHMET"));
		
		System.out.println(Arrays.binarySearch(isimler, "TUBA"));
		
		System.out.println(Arrays.binarySearch(isimler, "kursat"));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
