package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		String searchAuthor = sc.next();
		
		List<Integer> result = new ArrayList<>();
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			if(entry.getValue().equals(searchAuthor)) {
				result.add(entry.getKey());
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}
