package day27_Constructor_ConstructorCall;

public class TirRunner {

	public static void main(String[] args) {

		//Bir tane tüm özellikleri değiştiren constructor oluşturalım.......
		
		Tir tir1=new Tir(5000, "PASSAT", "beyaz", 2020, false);
		           //int km, String model, String renk, int yil, boolean satilikMi 
		
		System.out.println(tir1.km + " " + tir1.model + " " + tir1.renk + " " + 
		tir1.yil + " " + tir1.satılıkMi);
		
		// üç özelliği değiştiren bir constructor oluşturalım...
		//int km, String model, String renk mesela;
		
		Tir tir2=new Tir(12000, "POLO", "Kırmızı");
		
		System.out.println(tir2.km + " " + tir2.model + " " + tir2.renk + " " +
		tir2.yil + " " + tir2.satılıkMi);
		
		
		
	}

}
