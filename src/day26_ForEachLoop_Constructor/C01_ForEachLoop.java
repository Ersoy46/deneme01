package day26_ForEachLoop_Constructor;

public class C01_ForEachLoop {

	public static void main(String[] args) {

		//iki String array olusturunuz 
		//ve bu array'lerdeki ortak elemanları For-Each loop kullanarak bulunuz.
		//sonucu ekrana yazdiriniz.
		//ortak eleman yoksa ekrana "Ortak Eleman Yok" yazdiriniz....
		
		String arr1[]= {"A","C","B"};
		String arr2[]= {"A","C","O"};
		
		int ortak=0;
		
		for (String each1 : arr1) {
			
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) {
					
					System.out.print(each1 + " ");
					ortak++;
				}
			}
		}
		if (ortak==0) {
			System.out.print("Ortak Eleman yok");
		}
		
		
		
		
		
		
	}

}
