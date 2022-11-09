package day21_scope_arrays;

public class C01_Arrays {

	public static void main(String[] args) {

		//ELEMANLARI "ALİ", "VELİ", "AYSE", VE "FATMA" OLAN BİR ARRAY OLUSUTURN VE BU ARRAY'I YAZDIRIN 
		
		String arr[]=new String[4];
		arr[0]="ALİ";
		arr[1]="VELİ";
		arr[2]="AYSE";
		arr[3]="FATMA";
		
		 // veya söyle de yazılabilir
		String arr2[]= {"ALİ", "VELİ", "AYSE", "FATMA"};
		
		//SORU 2 :: SORU 1 DEKİ "ALİ" YERİNE "CAN", "AYSE" YERİNE "GUL" ATAYIN......
		
		arr2[0]="CAN";
		arr2[2]="GUL";
		
		System.out.println(arr2[1]);
		
		//  **** son elementi yazdırın   *****
		System.out.println(arr2[arr2.length-1]);
		
		System.out.println(arr2[0]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
