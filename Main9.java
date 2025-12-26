package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		int lastKey = 0;
		String lastValue = "";
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			lastKey = entry.getKey();
			lastValue = entry.getValue();
		}
		
		System.out.println(lastKey +" : "+ lastValue);
		sc.close();
	}

}
