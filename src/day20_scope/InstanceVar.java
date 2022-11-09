package day20_scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	//inttance veriable'lelarin scope'unda main method yotur..
	
	public static void main(String[] args) {

	//System.out.println(notMat);	//main method static oldugu icin static olmayan veriable'ler 
	                            //main method'da direk kullanılamaz veya görüntülenemez...
	
	//İnstance veriable'lara main method'dan ulasmak istersek obje olusturup
		//obje uzerinden erisim saglayabiliriz...
		// yani = Scanner scan=new Scanner(System.in)
		// ıcınde oldugumuz class'dan bir obje olusturalım
	
		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMat); // artık 50 yazacak.
		
	InstanceVar nihal=new InstanceVar();
	
	nihal.notMat=70;
	System.out.println(nihal.notMat);
	
	//İnstance veriable'larde deger atamazsak java instance olarak atanan degeri alır
	//bu class icin notMat=50 gibi 
	//ama istersek deger de atayabiliriz nihal gini örn;
	//bu durumda deger atadigimiz obje icin yeni deger gecerli olur.
	
	//** celil'in notunu degistirmek istiyorsak celil.notMat'a deger atamaliyiz.
	
	celil.notMat=90;   //gibi
	System.out.println(celil.notMat);  
	
	
	
	}
   public static void staticMethod() {
	
	//System.out.println(notFen); //İnstance veriable'lardan static methodlardan direk ulasılamaz

}
   public void method2() {
notFen=100;
	System.out.println("method2'deki notfen : " + notFen);	 //bu method static olmadıgı icin instance veriable'lara ulasabilir.


}
}

