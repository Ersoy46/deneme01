package day23_multiDimensionalArrays;

public class C03_MultiDimensionalArrays {

	public static void main(String[] args) {

		
		// SORU 1 )  Asagidaki multi dimensional array'in
		//tüm elemanlarının carpımını ekrana yazdıran bir methot yaziniz.
		//{1,2,}, {4,5,6,7}
		
		int arr[][]= {{1,2},{4,5,6,7}};
		
		carpimYazdir(arr);
	
	}

	private static void carpimYazdir(int[][] arr) {
		
int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				carpim*=arr[i][j];
				
			}
		}
		
		System.out.println(carpim);	

	}

}



