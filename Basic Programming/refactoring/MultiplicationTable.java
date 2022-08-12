package com.saranshmundepi.programming.refactoring;

public class MultiplicationTable {

	void print() {
		System.out.printf("Printing table of 5:");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
	}

	void print(int x) {
		System.out.printf("Printing table of "+x+" :");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", x, i, x * i).println();
		}
	}

	void print(int table, int from, int to) {
		System.out.printf("Printing table of "+table+" from "+from+" to "+to);
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}

}
