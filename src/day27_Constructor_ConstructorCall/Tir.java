package day27_Constructor_ConstructorCall;

public class Tir {

	   
		int yil=2000;
		String renk;
		String model;
		int km;
		boolean satılıkMi;

		 public Tir(int i, String string, String string2, int j, boolean b) {
             
			   // int km, String model, String renk, int yil, boolean satilikMi
			 //TirRunner calss'ından yolladıgımız değerlerin intance veriabla'lar ile eşleşmesi için 
			   //atamalarını yapmam lazim....
			km=i;
			model=string;
			renk=string2;
			yil=j;
			satılıkMi=b;
		 
		 }

		public Tir(int km, String model, String renk) {

			// i, String ve String2 isim olarak güzel isimler değil
			//Kodumuzu sonradan incelerken, anlaşılır değil..
			//Daha anlaşılır olması için veriable isimlerini anlamlı yapalım..
			//
		this.km=km;
		this.model=model;
	    this.renk=renk;
		
		//başına this. yazdıgımızda Java bu veriable'ın class level'daki oldugunu anlar.....
	    
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


