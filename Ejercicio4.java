import java.util.ArrayList;

public class Ejercicio4 {
	
	/*
	 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
	 * It should remove all values from list a, which are present in list b keeping their order.
	 * */
	
	public static int[] arrayDiff(int[] a, int[] b) {
		if(b.length == 0)
			return a;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < b.length; i++) {
			for(int x = 0; x < a.length; x++) {
				if(b[i] != a[x]) {
					list.add(a[x]);
				}
			}
		}
		int[] val =list.stream().mapToInt(i -> i).toArray(); 
		return val;
	}
	
}
