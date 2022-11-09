package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Verilen bir sayidan,  kucuk Fibonacci sayılarini bir List olarak kaydedelim....
		//1,1,2,3,5,8,13,21,34,55........ diye gidiyor kendinden önceki sayi ile toplanarak.....
		
		int sinir=100;
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);    //kaç tane sayi oldugunu bilmedigimiz icin while loop ile yapacagız
		int sayi=0;
		
		while (sayi<sinir) {
		
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			
			fibonacci.add(sayi);
			
		}
		
		System.out.println(fibonacci);
		
		fibonacci.remove(fibonacci.size()-1);
		
		
		
		
	}

}
