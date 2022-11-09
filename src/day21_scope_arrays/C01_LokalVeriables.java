package day21_scope_arrays;

public class C01_LokalVeriables {

	public static void main(String[] args) {

		//Java Lokal veriable'lara default deger ataması yapmaz
		//Kodlarımızda sorun yaşamamak için oluşturdugumuz lokal veriable'lara uygun bir deger atamamamızda fayda var.
		
		int sayi=0; //int say;dersek java CTE veriyor.
		System.out.println(sayi);
		
		
		//int sayi; //bir lokal'de aynı isimle birden fazla veriable OLUSTURULAMAZ....
		//String sayi; // Data türü degişik olsa bile Java buna izin vermez....
		
	}
public static void staticMethod() {
        //	sayi;// farklı local'de olusturulan veriable method'ların static olup olmamasına 
	   //baglı olmaksızın  farklı lokalde kullanılamaz....
	
	@SuppressWarnings("unused")
	String isim="veli";
	
}
}
