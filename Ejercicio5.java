import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio5 {
	
	/*
	 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have 
	 * the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements 
	 * in a squared, regardless of the order.
	 * */
	
	public static boolean comp(int[] a, int[] b) {
		if(a == null || a.length == 0 || b == null || b.length == 0 || (a.length != b.length)) 
			return false;
		
		List<Integer> listA = new ArrayList<Integer>(a.length);
		List<Integer> listB = new ArrayList<Integer>(b.length);
		
		for(int i : a) {
			listA.add(i);
		}
		Collections.sort(listA);
		
		for(int i : b) {
			listB.add(i);
		}
		Collections.sort(listB);
		
		for(int i = 0; i < a.length; i++) {
			if(listB.get(i) != Math.multiplyExact(listA.get(i), listA.get(i))) {
				return false;
			}
		}
		
	    return true;
	  }
	
}
