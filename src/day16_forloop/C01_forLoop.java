package day16_forloop;

public class C01_forLoop {

	public static void main(String[] args) {
	
		
		for (int i = 15; i > 10; i--) {
			System.out.print(i + " ");
		}
		//for loop baslangıc ve bitis sartı bir sayının degerine baglı olan 
		//durumlarda tercih edilir
	
	
	     //eger baslangıc sayısı artıs/azalıs ile bitis degerine yaklasmıyor, uzaklasıyor ise 
	     //loop hicbir zaman durmaz
	     // bu drumda sonsu loop deriz ve bu durumun gerceklesmesini istemeyiz
	     
	   
	   
	   // eger ilk deger icin bitis sartı true olmaz ise 
	   //daha ik adımda loop broken olur 
	   //dolayısoyla loop body hic calısmadan , loop'un sonrasına gecilir 
	  //LOOP calısır ama gic bir islem yapmaz.....
		
		/*
		
		for (int i = 0; i <10 ; i++) {
			System.out.println(i + " ");
			
		}
		*/
		
		for (int i = 0; i>-10; i--) {
			System.out.println(i + " ");
		}
		

	}

}
