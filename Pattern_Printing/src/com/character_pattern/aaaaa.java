package com.character_pattern;

class aaaaa {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= 5; column++) {
				System.out.print((char)(96+row));
				//ascii values of a-z starts from 97-122
			}
			System.out.println();
		}
	}

}
