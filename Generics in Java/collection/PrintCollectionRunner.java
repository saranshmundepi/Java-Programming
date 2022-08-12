package com.saransh.generics.collection;

import java.util.*;

public class PrintCollectionRunner {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		LinkedList<Integer> ll=new LinkedList<>();
		HashSet<Integer> hs=new HashSet<>();
		Deque<Integer> dq=new LinkedList<>();
		
		int i;
		for(i=1;i<=10;i++) {
			al.add(i);
			ll.add(11-i);
			hs.add(i%5);
			dq.offerFirst(i);
		}
		
		PrintAnyCollection.printCollection(al);
		PrintAnyCollection.printCollection(ll);
		PrintAnyCollection.printCollection(hs);
		PrintAnyCollection.printCollection(dq);

	}

}
