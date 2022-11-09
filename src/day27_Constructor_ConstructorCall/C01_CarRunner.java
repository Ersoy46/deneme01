package day27_Constructor_ConstructorCall;

import day26_ForEachLoop_Constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {

	//Dünkü Car class'indan bir obje oluşturmak itedigimizde 
		//Java Car class'ini içinde bulundugumuz class'a import etmek ister. 
	
		Car car=new Car();
		
		System.out.println(car.yil);
		
		//ancak başka pacgace'da oldugu için bu içinde oldugumuz class'dan 
		//Car class'ındaki veriable'lara ulaşabilmem için veriable'in axcess modifier'i 
		//public olmalidir***** 
		
		Car1 car1=new Car1();
		
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satılıkMi);
		
		car1.km=75000;
		car1.model="COROLLAAAAA";
		car1.renk="KIRMIZI";
		
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satılıkMi);
		
		Car1 car2=new Car1();
		
		System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satılıkMi);
		
		car2.model="MERCEDES";
		car2.renk="SİYAH";
		
		System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satılıkMi);
		
		Car1 car3=new Car1();
		
		car3.km=40000;
		car3.satılıkMi=true;
		car3.yil=2016;
		
		System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satılıkMi);
		
		
	}

}
