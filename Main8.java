package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		for(int i=0; i<n1; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map1.put(key, value);
		}
		
		int n2 = sc.nextInt();
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
		for(int i=0; i<n2; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map2.put(key, value);
		}
		
		LinkedHashMap<Integer, String> merged = new LinkedHashMap<>();
		merged.putAll(map1);
		merged.putAll(map2);
		
		System.out.print("[");
		int count = 0;
		for(Map.Entry<Integer, String> mergedmap : merged.entrySet()) {
			System.out.print("("+mergedmap.getKey()+", \""+mergedmap.getValue()+"\")");
			count++;
			if(count<merged.size()) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

		sc.close();
	}

}
