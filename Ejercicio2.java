public class Ejercicio2 {
	
	/*
	 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
	 * which is the number of times you must multiply the digits in num until you reach a single digit.
	 * */
	public static int persistence(long num) {
		long remainder = 0, temp = 1;
		int counter = 0, times = 0;
		if(num < 10) {
			return 0;
		}
		
		while(num > 0) {
			remainder = num % 10;
			num /= 10;
			temp = temp * remainder;
			times++;
			
			if((num == 0 && temp != 0) || (num == 0 && times > 0)) {
				if(times>1) {
					num = temp;
					counter++;					
				}
				temp = 1;
				times = 0;
			}
		}		
		
		return counter;
	}
	
}
