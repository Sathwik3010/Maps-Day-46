package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, String> map1 = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map1.put(key, value);
		}
		
		int m = sc.nextInt();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		for(int i=0; i<m; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map2.put(key, value);
		}
		
		map1.putAll(map2);
		
		System.out.print("[");
		int count = 0;
		for(Map.Entry<Integer, String> entry: map1.entrySet()) {
			if(count > 0) {
				System.out.print(", ");
			}
			System.out.print("("+entry.getKey()+", \""+entry.getValue()+"\")");
			count ++;
		}
		System.out.print("]");

		sc.close();
	}

}
