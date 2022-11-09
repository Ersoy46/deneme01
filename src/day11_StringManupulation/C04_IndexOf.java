package day11_StringManupulation;

public class C04_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parametre olarak girilen bir char veya string'in 
		//ilk index ini verir. 
		
		String str="Calısırsanız, Java Ogrenmek Cok Kolay";
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf("J"));
		
		System.out.println("t");
		
		
		int index=str.indexOf('p');
		
		System.out.println(index);
		
		
		System.out.println("Java");
		
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.indexOf(11));
		
		
		System.out.println(str.indexOf('e', 20));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
