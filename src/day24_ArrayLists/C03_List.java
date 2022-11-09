package day24_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Verilen bir array'dan istenen degere sahip elementleri silip 
		//kalani yeni bir array olarak kaydedin
		//ve sonra yeni bir array'i yazdirin....
		
		int arr[]= {3,4,5,6,3,5};
		int silinecekEleman=6;
		
		List<Integer> gecici=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=silinecekEleman) {
				gecici.add(arr[i]);
				
			}
		}
		
		System.out.println("List olarak : " + gecici);    //List olarak istenmeyen eleman haric tum elemanları görürüz.....
		
		//sonucu array olarak istiyorsak 
		//listedekileri array'e ekleriz
		
		
		int yeniArray[]=new int[gecici.size()];
		
		for (int i = 0; i < yeniArray.length; i++) {
			
			yeniArray[i]=gecici.get(i);
			
		}
		
		
		//yeniArray'imizi yazdıralım
		
		System.out.println("Array olarak : " + Arrays.toString(yeniArray));
		
		
		
		
		
		
		
		
		
		
		
	}

}
