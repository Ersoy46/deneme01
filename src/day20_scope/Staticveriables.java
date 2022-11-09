package day20_scope;

public class Staticveriables {

	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
		
	public static void main(String[] args) {
		
		//static veriable'lara main method 'dan direk ulasılabilir mi ? EVETTTT 
		
		System.out.println(no);	
		no++;
		System.out.println(no);
		staticMethod();
	
		Staticveriables obje=new Staticveriables();
		obje.staticOlmayanMethod();
	
	}
public static void staticMethod() {
	
	no++;
	System.out.println("static method'da sayi: " + no);
}

public void staticOlmayanMethod() {
	no++;
	System.out.println("static olmayan Method'da sayi : " + no);
}













}
