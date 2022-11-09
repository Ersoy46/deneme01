package day26_ForEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		
		//Jeep class'ından bir obje oluşturalım ve özelliklerini yazdıralim...
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " +
		jeep1.yil);    //cevap 6475000, 1001, null, null , 2011
		
		//*********** Jeep class'indaki veriable'lar instance veriable 'lar olduklarindan 
		//atadigim degerler sadece benim objem için degerler değiştirir.
		//jeep class'indaki degerlere hiç bir şey yapmaz ************
		
		
		jeep1.marka="TOYOTA";      //****BURADA İSTEDİGİMİZ DEFAULT DEGERLERE YENİ ATAMA YAPABİLİRİZ.
		jeep1.model="COROLLA";
		jeep1.fiyat=750000;
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " +
				jeep1.yil);    //cevap 6475000, 1001, null, null , 2011
		
	
		jeep1.hiz(150);
		jeep1.yakit("benzin/lpg");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
