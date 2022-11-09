package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {

	public static void main(String[] args) {

		//MultiDimensional Arrayler iç içe konulmuş Array'lerdir.
		//Arrayoluşturmak için 2 yönteimiz vardı;
		//1.yöntem önce declare edip sonra deger atama 
		
		int arr[][]=new int [3][2];
		
		//outer array'i 3  elemanli
		//her bir inner array' ise 2 elamanli olan MDarray olusutur.
		//Bu yöntemle olusturdugumuzda inner array'lerin hepsi ayni boyutta olmalidir.
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println(Arrays.deepToString(arr));  //array' ın derinlerine inmesi 
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		
		System.out.println(Arrays.deepToString(arr));
		
		//Arrayoluşturmak için 2 yönteimiz vardı;
		//2.Yöntemimi ise hem declare edip hemde deger atayabiliriz. 
		
		
		int arr2[][]= {{0},{1,2,3},{6,7,8,9}};
		
		System.out.println(Arrays.deepToString(arr2)); //[[0], [1, 2, 3], [6, 7, 8, 9]]
		
		System.out.println(Arrays.toString(arr2[1]));  //[1,2,3]
		
		System.out.println(arr2[2][1]);  // 7
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
