package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		//Verilen iki array'i birleştiren ve sonucu birleşikarray 
		//isminde bir array'e kaydeden bir method olusturunuz...

		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6,8,9};
		
		int birlesikArray[]=birlestir(arr1,arr2);
		
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray)); //[3,5,7,10,0,0,0,0,,0] olarak yazdırır...
		
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {

	//	new int [arr1.length + arr2.length];
		
	//	for (int i = 0; i < arr1.length; i++) {  //1'inci array'in elemanlarını birleşik array'e atadık. 
			
	//		birlesikArray[i]=arr1[i];  BU ŞEKİLDE YAZDIRABİLİRZ YA DA DAHA KOLAY OLARAK ŞU ŞEKİLDE YAZDIRIRIZ......
		
		
		int birlesikArray[]= Arrays.copyOf(arr1, arr1.length+arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			
			birlesikArray[i+ arr1.length]=arr2[i];
		}
		
		
		return birlesikArray;
	}

}
