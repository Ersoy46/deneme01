package day21_scope_arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {

		//VERİLEN 3 ELEMANLİ BİR ARRAY'İN TÜM ELEMANLARINI BİR SOLDAKİ KONUMA TASIYACAK BİR PROGRAM YAZIN. 
		//ÖRN; ARRAY[1,2,3] İSE OUTPUT[2,3,1] OLACAK SEKİLDE......
		
		
		
		int arr[]= {1,2,3,4,5,6,8,90};
		int kova=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=kova;
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
	}

}
