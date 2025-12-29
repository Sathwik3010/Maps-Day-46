package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main92 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hashtable<Integer, String> table = new Hashtable<>(); 
		
		for(int i=0; i<n ;i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table.put(key, value);
		}
		
		int searchKey = sc.nextInt();
		
		System.out.println(table.containsKey(searchKey));
		sc.close();
	}

}
