package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {

		//"JAVA ÖGRENMEK COK GÜZEL"
		//CUMLESİNİNİN KELİMELİRİNİ TERS SIRADA YAZDIRIN....
		
		String cumle="Java ogrenmek cok COKCOK COK güzel";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));    // [Java, ogrenmek, cok, güzel]
		
		for (int i = kelimeler.length-1; i >=0; i--) {
		
			System.out.print(kelimeler[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
