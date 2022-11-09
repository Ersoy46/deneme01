package day27_Constructor_ConstructorCall;

public class Car1 {


    int yil=2000;
	String renk;
	String model;
	int km;
	boolean satılıkMi;
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
			//atama yapacagımız tüm özellikleri parametre olarak yolladik.
		
	}
		//ben 5 özelliği birden değiştiren bir constructor ürettiğimde 
	   // Java default constructor'u siler....
	//  Bu durumda daha önceden yazılan ve default construcotr'ı kullanan tüm kodlar çöker ******
	  //Bu durumda kodları düzeltmek için Java'nın sildiği default constructor yerine parametresiz bir constructor oluşturmalıyım*******
	
	Car1(){
		
	} 
	
	//*******   Parametresiz constructor üretmenin syntax'i ==classAdi+() + { ************
	
	
	public Car1(int i) {   //bu satirdaki int km ile class leveldeki int km farkli scope'lardadir.

		km=i;
		

	}
	public Car1(int i, int j) {

	yil=i;
	km=j;
}

	public void hiz(int hiz) {
		
		System.out.println("araba saatte : " + hiz + " km yapar");
	}
	
	public void yakit(String yakit) {
		
		System.out.println("Araba yakit olarak : " + yakit + " kullanir");
	}
}
