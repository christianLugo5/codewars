package com.test.console;

public class Ejercicio3 {
	
	/*
	 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
	 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
	 * The array will always contain letters in only one case.
	 * */
	
	public static char missingLetter(char[] array) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz", alphabetUpper = alphabet.toUpperCase();
		char val = ' ';
		boolean upper = false;
		int i = alphabet.indexOf(array[0]), length = array.length;
		
		if(i < 0 ) {
			i = alphabetUpper.indexOf(array[0]);		
			upper = true;
		}		
		
		for(int o = 0; o < length; o++) {
			if(!upper) {
				if(alphabet.charAt(i) != array[o]) {
					val = alphabet.charAt(i);				
					break;
				} 
			}else {
				if(alphabetUpper.charAt(i) != array[o]) {
					val = alphabetUpper.charAt(i);
					break;
				} 
			}
			i++;
		}
		return val;
	}
	
}
