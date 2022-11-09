package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {

		//bazen index ile hiç uğraşmadan bir array veya listedeki tüm elemanlari 
		//gözden geçirmek isteriz...
		
		int arr[]= {1,2,3,5,3,2,7};
		
		//bu array'i esnek bir list yapmak istersek EĞER;
		
	List<Integer> yeniList=new ArrayList<>();
	
	for (int each : arr) {   //arr'deki herbir (each) int'i bana bul getir demek oluyor
		
		yeniList.add(each);
		
		
	}
		System.out.println(yeniList);
		
		//Eğer bir list veya array'in tüm elemanlarini elden geçirmek istiyorsak 
		//ve siralama önemli değilse   for-each loop kullanırız.......
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
