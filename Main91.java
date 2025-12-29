package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class Main91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Hashtable<Integer, Integer> table = new Hashtable<>();
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			
			table.put(id, table.getOrDefault(id, 0)+1);
		}
		
		Iterator<Integer> it = table.keySet().iterator();
		int count = 0;
		
		while(it.hasNext()) {
			System.out.print(it.next()+":"+table.get(it.next()));
			count++;
			
			if(count<table.size()) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
