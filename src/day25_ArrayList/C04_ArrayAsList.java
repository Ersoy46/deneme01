package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArrayAsList {

	public static void main(String[] args) {

		//Verilen bir array'i Array class'inden yardim alarak 
		//list'e çevirebiliriz.
		
		String arr[]= {"A", "b","C","d"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList);
		
	//	arraydenList.add("F");
		//   System.out.println(arraydenList);     //RTE HATASI VERDİ 
		                                      //CTE olması icin sytax'te problem olmasi lazim, ancak bu yazimda sytax hatasi yok
		
		
		  arr[1]="Z";            //b yerine Z ile degiştirdik...
		  
		  System.out.println("array'i degistirdikten sonra, array =" + Arrays.toString(arr));
		  
		  System.out.println("array'i degistirdikten sonra, List =" + arraydenList);
		
		arraydenList.set(3, "D");     //küçük harfi büyük yapmak için bu method'u kullanacagız....... (set)
		
		 System.out.println("array'i degistirdikten sonra, List =" + arraydenList);
		
		 System.out.println("array'i degistirdikten sonra, array =" + Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
