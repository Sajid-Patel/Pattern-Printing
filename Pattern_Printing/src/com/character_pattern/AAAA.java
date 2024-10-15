package com.character_pattern;

class AAAA {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= 5; column++) {
				System.out.print((char)(64+row));
				//ascii values of A-Z starts from 65-90
			}
			System.out.println();
		}
	}

}
