package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {

		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);   //[A, Z, F, D]
		
		harfler.remove(1);   //[Z]  harfi kaldırıldı....   bu satır gidip 1 index'indeki elemani remove eder. yani siler.....
		
		// listenin kalanını görek istersek eger syso ile yazdırabliriz.. System.out.println(harfler.remove(1));   //[Z]
		
		
		System.out.println(harfler);      //[A, F, D]
		
		System.out.println(harfler.remove(2));
		
		System.out.println(harfler);
		
		harfler.remove("F");      // burada da yine gidip F yi remove eder. 
		
		System.out.println(harfler.remove("F"));    //LİSTEDE VAR İSE TRUE DÖNER YOK İSE FALSE DÖNER..... BİR ÖNCEKİ YAZIDA KALDIRDIK F' Yİ 
		System.out.println(harfler);
		
		

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		
		
		System.out.println(harfler);
		System.out.println(harfler.remove("A"));
		
		System.out.println(harfler);
		
	}

}
