package day16_forloop;

public class C04_ForLoop {

	public static void main(String[] args) {
	
		//100 den baslayarak 50' ye kadar(50 dahil) olan 
		//sayıları aralarında vırgul olarak aynı satırda yazdırın.
		
		
	for (int i = 100; i >=50; i--) {
		if (i==50) {
		System.out.println(i);	
		} else {
			System.out.print(i + ", ");
		}
	}	
		System.out.println();
		
		for (int i = 100; i >50; i--) {
		System.out.print(i + ", ");	
		}
		System.out.print(50);
		
		
		
		
		
		
		
		
		
		
		
	}

}
