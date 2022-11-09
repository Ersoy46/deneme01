package day19_whileloop_DoWhileLoop;

public class C03_DoWhileLoop {

	public static void main(String[] args) {


		//'m' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin...
		
		
		for (char i = 'm'; i >='c'; i--) {            //harf oldugu icin *İNT* degil *CHAR* olarak degistirdik 
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//======aynısını While Lopp la yapalım===========
		
		char krk='m';
		while (krk>='c') {
			System.out.print(krk + " ");
		krk--;
		
		}
		System.out.println("");
		
		//=========Do-WhileLoop ile yapalım ========
		
		
		char harf='m';
		do {
			System.out.print(harf + " ");
			harf--;
			
		} while (harf>='c');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
