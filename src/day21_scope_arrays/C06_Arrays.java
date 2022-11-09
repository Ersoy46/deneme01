package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		//VERİLEN BİR ARRAY'IN TUM ELEMANLARINI TOPLAYAN BİR PROGRAM YAZDIRIN...
	
		int arr[]= {3,5,8,65,32,34};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
		System.out.println("ELEMENTLERİN TOPLAMI :" + toplam);
		
		
		
		//*****bir array'ın tum elemanlarını önce kucukten buyuge sonra buyukden kucuge yazdırın.... ******
		
		
		Arrays.sort(arr);  //kucukten buyuge böyle *****
		
		System.out.println(Arrays.toString(arr));
		
		//buyukten kucuge ise ****   ya for loop ile elamanları ter sırada yazdırırız.
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		//array yapmak istersek eger aynı uzunlukda bir array olusuturup 
		//elemanları ters sirada yeni array'a tasiyabiliriz.....
		
		
		int tersArray[]=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		
		tersArray[i]=arr[arr.length-1-i];
		
	}
		
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
	}

}
