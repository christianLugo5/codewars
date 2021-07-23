import java.util.ArrayList;

public class Ejercicio4 {
	
	/*
	 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
	 * It should remove all values from list a, which are present in list b keeping their order.
	 * */
	
	public static int[] arrayDiff(int[] a, int[] b) {
		if(b.length == 0)
			return a;
		
		List<Integer> listB = new ArrayList<Integer>();
		for(int i = 0; i < b.length; i++) {
			listB.add(b[i]);			
		}
		List<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {			
			if(!listB.contains(a[i])) {
				newList.add(a[i]);
			}			
		}		
		
		return newList.stream().mapToInt(i -> i).toArray();
	}
	
}
