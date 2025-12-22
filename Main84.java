package com.codegnan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		String searchValue = sc.next();
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int key: map.keySet()) {
			if(map.get(key).equals(searchValue)) {
				result.add(key);
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}
