package com.saranshmundepi.programming.refactoring;

public class RefactoringExamples {

	void print() {
		System.out.printf("Printing table of 5:");
		print(5);
	}

	void print(int x) {
		System.out.printf("Printing table of "+x+" :");
		print(x, 1, 10);
	}

	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("Printing table of "+table+" from "+from+" to "+to);
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}

}
