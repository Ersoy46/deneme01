package day17_forLoop;

public class C08_NestedForLoopÖdev {

	public static void main(String[] args) {
		
		//Kullanıcıdan pozitif bir rakam girmesini 
		//isteyin ve girilen rakama göre asagidaki sekli cizdirin
		
		 // *
		 // **
		 // ***
		 //  ****
	
		for (int satir = 0; satir>=1; satir--) {
		
		
		for (int i = 1; i <=4; i++) {
			System.out.print(satir*i + " ");
		}
		
		System.out.println("");
		
		
		
	}		

	}

}
