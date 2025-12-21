package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		int removeKey = sc.nextInt();
		
		map.remove(removeKey);
		
		System.out.print("[");
		int count = 0;
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
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
