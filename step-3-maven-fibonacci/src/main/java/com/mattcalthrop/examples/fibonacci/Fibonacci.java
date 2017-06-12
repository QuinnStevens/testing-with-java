package com.mattcalthrop.examples.fibonacci;

public class Fibonacci {
	public int calculate(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("The Fibonacci sequence does not have numbers with a negative index.");
		}
		
		if (index == 0 || index == 1) {
			return 1;
		}

		return calculate(index-1) + calculate(index-2);
	}
}
