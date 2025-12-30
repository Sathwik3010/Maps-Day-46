package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hashtable <Integer, String> table1 = new Hashtable<>();
		Hashtable <Integer, String> table2 = new Hashtable<>();

		int n1 = sc.nextInt();
		for(int i=0; i<n1; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table1.put(key, value);
		}
		
		int n2 = sc.nextInt();
		for(int i=0; i<n2; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table2.put(key, value);
		}
		
		table1.putAll(table2);
		
		Iterator<Map.Entry<Integer, String>> it = table1.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.print(entry.getKey()+":"+entry.getValue());
			if(it.hasNext()) {
				System.out.print(" ");
			}
		}
		sc.close();

	}

}
