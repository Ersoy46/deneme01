package JAVALAMBDA;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda01 {
	
	public static void main(String[] args) {
		
		List<Integer>list =new ArrayList <>(Arrays.asList(12,13,65,3,7,7,34,22,60,42,55));
		structuredEl(list);
		System.out.println(" ");
		System.out.println("****");
		printElFunctional(list);
		System.out.println(" ");
		System.out.println("****");
		printElFunctional1(list);
		
		
	}	
		
		//Structured programing ile List elemanlarının tamamını yazdırınız...
		public static void structuredEl(List<Integer>list) {
			
			for (Integer w : list) {

				System.out.print(w + " ");
			}
		}
		
		
		//Functional programing ile List elemanlarının tamamını yazdırınız...
		
		public static void printElFunctional(List<Integer>list) {
			list.stream().forEach(t->System.out.print(t + " "));
		}
		
		public static void printEl(int t) {
			System.out.print(t + " ");
		}
		//list.stream().forEach(lambda01::printEl);   *****BUNU EZBERLE    CLASSNAME::METHODNAME *****
		public static void printElFunctional1(List<Integer>list) {
			
			list.stream().forEach(lambda01::printEl);
		}
		
		
		
		
		
		
		
	

}
