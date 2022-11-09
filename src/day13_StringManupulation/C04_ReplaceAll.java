package day13_StringManupulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodları kullanarak java ogrenmek cok kolay yapalım.
		
		str=str.replaceAll("\\d", "");
		System.out.println(str);
		
		str=str.replaceAll("\\s", "x");
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);
		
		str=str.replace("x", "  ");
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
