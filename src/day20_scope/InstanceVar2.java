package day20_scope;

public class InstanceVar2 {

	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ögrenciMi=true;
	boolean izinliMi;
	
	
	public static void main(String[] args) {

		//instance veriable'lara main method 'dan direk ulasılabilir mi ? HAYIR 
		//NASIL ULASILIR PEKİ ====== OBJE OLUSTURARAK..
		
		InstanceVar2 ali=new InstanceVar2();
		System.out.println(ali.adres);
		System.out.println(ali.dogumYeri);
		System.out.println(ali.notOrtalamasi);
		System.out.println(ali.izinliMi);
		System.out.println(ali.yasOrt);
		System.out.println(ali.karakter);
		
	}
public static void staticMethod() {
	
}
public void staticOlmayanMethod() {
	
}
}
