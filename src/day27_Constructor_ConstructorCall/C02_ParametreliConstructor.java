package day27_Constructor_ConstructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		
		//Java'nın oluşturdugu default constructor ile obje oluşturabiliyoruz
				//Ama her obje çin değer ataması yapmak uzun oluyor 
				//İstersek parametreli constructor oluşturup daha obje oluşurken istedigim özellikleri atayabilirim...
				
				Car1 car1=new Car1(50000, "Vectra",    "Beyaz",    2015,              true);
				              //int km, String model, String renk, int yil, boolean satilikMi 
				
				Car1 car2=new Car1(35000);
				
		System.out.println(car2.km);
		
		
		Car1 car3=new Car1();
		
		car3.km=5300;   //burada direk biz değer atayabiliriz istersek 
		
		System.out.println(car3.km);
		
		Car1 car4=new Car1(1000);
		System.out.println(car4.km);
		
		//yil ve km'yi parametre olarak girebileceğim bir constructor daha oluşturabilirmiyim??
		
		Car1 car5=new Car1(2020, 5000);
		                 //yil   km 
		             
		System.out.println(car5.yil + " " + car5.km + " " + car5.model);
		
	}

}
