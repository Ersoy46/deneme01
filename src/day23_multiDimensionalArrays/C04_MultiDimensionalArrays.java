package day23_multiDimensionalArrays;

public class C04_MultiDimensionalArrays {

	public static void main(String[] args) {

		//Aşagıdaki Multi Dimensional array'in array'lerindeki son elemanların 
		//carpımını ekrana yazdiran bir program yazınız. 
		// {{1,2,3},{4,5},{6}}
		
		int arr[][]= {{1,2,3},{4,5},{6},{8,7}};
		
		int sonuc=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			int sonElemanIndex=arr[i].length-1;
			sonuc*=arr[i][sonElemanIndex];
			
		}
		System.out.println(sonuc);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
