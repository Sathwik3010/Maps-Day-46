package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Hashtable<Integer, String> table = new Hashtable<>();
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table.put(key, value);
		}
		
		int searchKey = sc.nextInt();
		
		if(table.containsKey(searchKey)) {
			System.out.println(table.get(searchKey));
		} else {
			System.out.println("Key not Found");
		}
		sc.close();
	}

}
