package day21_scope_arrays;

public class C02_LoopVeriables {

	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i <6; i++) {
			sayi--;
		String isim="Ali";
			
			System.out.println(sayi + " " + isim);	
		}
		
	
	//Loop icerisinde olusturulan veriable'lar loop dısında kullanılamz
		//Bunun icin loop dısında da ihtiyacımız olan bir  degisken varsa 
		//Loop'dan önce olusuturu ve emniyette kalmak icin initialize yapariz....
		
		
		for (int i = 0; i < 10; i++) {
		//	int sayi=20;  sayi veriable'i main method'un icinde olusturuldugundan tum main method'da 
			//gecerlidir, dolayisiyla yeniden aynı isimle bir veriable olusturamazsınız...
			
			
		}
		
	
		
		
		
	}

}
