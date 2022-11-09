package JAVALAMBDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class lambda02 {

	public static void main(String[] args) {

		List<Integer>list =new ArrayList <>(Arrays.asList(12,-3,65,3,7,34,22,-60,42,15));
		ciftKareMax(list);
	}

//List'in cift olan elemanlarını aliniz ve en büyügünü yazdiriniz.

    public static void ciftKareMax(List<Integer>list) {
  Optional<Integer> maxEl  =  list.stream().filter(t->t%2==0).map(t->t*t).reduce(Math::max);
    }
    public lambda02() {
		// TODO Auto-generated constructor stub
	}
    






}













