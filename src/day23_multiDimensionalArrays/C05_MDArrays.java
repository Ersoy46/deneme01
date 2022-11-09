package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_MDArrays {

	public static void main(String[] args) {

		//Kullanıcıdan bir cümle isteyin ve 
		//cümledeki kelime sayisini yazdirin....
		
		String cumle="Her şey, java ile kolay degil mi?";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); //bunu yazdırmasak da olur **********
		
		System.out.println("girilen cumlede :" + kelimeler.length +  " adet kelime var");
			
		
	}

}
