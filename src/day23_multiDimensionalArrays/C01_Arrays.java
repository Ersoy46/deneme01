package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Arrays {

	public static void main(String[] args) {

		//Verilen bir array'den istenen degere sahip elementleri silip
		//kalanı yeni bir array olarak kaydedin 
		//ve sonra yeni array'i yazdirin....
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=3;
		
		//array'de yeni eleman ekleyemeiz veya var olan elemanları silemeyiz
		//cunkü array'ın deklare edilen uzunlugu DEGİŞMEZ....
		//Bu soruda istenen elementi sildigimizd geriyee element kaliyor bulmamız lazım..
		//silinecek sayi adedini bulalım???
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}

		System.out.println(sayac);
		
		int yeniArrayUzunluk=arr.length-sayac;
		
		//Artık yeni array'i olusturabiliriz
		
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		//imdi eski array'deki elemanlari birer birer alıp 
		//silinecek elemana eşit olmayanları yeni array'e atamalıyız....
		
		int index=0;
		for (int i = 0; i < yeniArr.length; i++) {
			
			
			if (arr[i]!=silinecekEleman) {
			yeniArr[index]=arr[i];
			
			index++;
			}	
			}
		System.out.println(Arrays.toString(yeniArr));
		
	
				
	}

}
