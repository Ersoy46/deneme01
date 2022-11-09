package day26_ForEachLoop_Constructor;

public class CarRunner {

	public static void main(String[] args) {

		//Car class'indan bir obje oluşturalım bir önceki class ****
		
		Car             car1                       =new                 Car();
	//class ismi       //obje ismi atama 

		System.out.println(car1.satılıkMi() + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satılıkMi);
		
		//Bir obje oluştururken eğer, obje için kendi class'inda belirlenen degerleri kullanmmak istiyorsam 
		//hiçbir degeri kendim atamadan obje oluşturabilirim.
		//bu durumda hiç bir parametre kullanılmadıgı için default constructor yeterli olacaktir..
		
	
		//Eğer obje oluşturdugum class'daki değerleri kullanmak yerine kendim kendi 
		//degerlerimle bir obje oluşturmak istersem o zaman parametreli constructor oluşturmam gerekir 
		
		// ******//Car Car2=new Car[("Kirmizi olsun", "Corolla olsun"); ********
		
		//Car class'inda iki String parametresi olan bir constructor olmadıgı için 
		//bu obje oluşturmayi yapamayiz..
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
