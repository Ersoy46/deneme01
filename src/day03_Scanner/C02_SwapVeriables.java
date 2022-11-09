package day03_Scanner;

public class C02_SwapVeriables {

	public static void main(String[] args) {

		int sayi111 = 10;
		int sayi222 = 20;

		// Baslangıçta sayi=10 ve sayi2=20

		System.out.println("baslangıçta sayi111=" + sayi111 + "  ve sayı222=" + sayi222);

		// ilk önce bos bir verible oluşturalım

		int bos;

		bos = sayi111;

		sayi111 = sayi222;
		sayi222 = bos;
		System.out.println("sonuçta sayi111=" + sayi111 + " ve sayi222=" + sayi222);

	}

}
