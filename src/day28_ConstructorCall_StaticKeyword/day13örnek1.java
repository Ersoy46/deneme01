package day28_ConstructorCall_StaticKeyword;

public class day13örnek1 {

	public static void main(String[] args) {


		String str="*Java 98ogrenmek c..ok k876olay";
		
		str=str.replaceAll("\\d", "");		
		
	System.out.println(str);
	
	str=str.replaceAll("\\s", "x");
	
	str=str.replaceAll("\\W", "");
	
	System.out.println(str);
	
	str=str.replace("x", " ");
		
	System.out.println(str);
		
		
		
	}

}
