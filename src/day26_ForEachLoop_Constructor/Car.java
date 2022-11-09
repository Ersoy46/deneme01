package day26_ForEachLoop_Constructor;

public class Car {

	// Java biz bir class olustudugumuzda, o class!dan obje üretecegimizi bilir.
	//ve her class!a default bir constructor yerleşririr.
	//Java!nin class'a koydugu bir default constructor görülmez
	//ama obje üretmek üzere kod yazdıgımızda otomatik olarak devreye girer.
	
	//Bİr constructr olusturmak çok kolaydır
	//method'a benzer ama method'dan farklıdır.
	//1'inci kural ; Constructor ismi class ismi ile ayni olmalıdır..
	// class isimleri büyük harfle başladıgı için constructor ismide büyük harf ile başlar.
	//(method'dan birinci farkı budur,method'lar kucuk harf ile başlar)....
	//2'inci kural ise ; Constructor'ların return type olmaz ***
	//method'larda mutlaka return type olur constuctor da olmaz ***** 
	
	
	public Car() {
		
	}
	//Java'nınher class'da olusturdugu contructor budur....
	

	public int yil=2011;
	String renk;
	String model;
	private int km;
	boolean satılıkMi;
	public String satılıkMi() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//bugün itibari ile class'larda main method olma mecburiyeti kaldırılmiştir...
	//Ancak bildigimiz gibi main method olmayan bir class  direk çalıştırılmaz..7
	//main method'u olmayan class'lar başka class'lardan obje oluşturularak kullanılmak 
	//üzere ihtiyaç duyulan veriable ve method'lari sakladıgımız bir depo gibidir.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
