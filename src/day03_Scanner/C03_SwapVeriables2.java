package day03_Scanner;

public class C03_SwapVeriables2 {

	public static void main(String[] args) {

		int sayı1 = 15;
		int sayi2 = 20;
		System.out.println("baslangıçta sayi1=" + sayı1 + " ve sayi2=" + sayi2);

		// ucuncu bir veri kullanmayacaksak, verilen iki sayinin farkindan istifade
		// ediyoruz.

		// ilk adım olarak sayiların farkını ilk sayıya assign ediyoruz.

		sayı1 = sayı1 - sayi2;
		sayi2 = sayı1 + sayi2;
		sayı1 = sayi2 - sayı1;

		System.out.println("sonuçta sayi1=" + sayı1 + " ve sayi2=" + sayi2);

	}

}
