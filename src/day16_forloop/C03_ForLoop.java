package day16_forloop;

public class C03_ForLoop {

	public static void main(String[] args) {
		
      //10 ile 30 arasındaki (10 ve 30 dahil) sayıları aralarında 
      //vırgul olarak aynı satırda yazdırın ?
		
		for (int i = 10; i <=30; i++) {
			if (i==30) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		//bos syso sadece alt satıra geçmek icin kullanılır.
		System.out.println();
		
		for (int i = 10; i <=29; i++) {
		System.out.print(i + ", ");
	}
System.out.print(30);
System.out.println();
System.out.println("merhabalar");
}
	
}