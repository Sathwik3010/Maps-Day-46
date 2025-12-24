package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] keys = new int[n][1];
		String[] values = new String[n];
		
		for(int i=0;i<n; i++) {
			keys[i][0] = sc.nextInt();
			values[i]=sc.next();
		}
		
		int capacity = sc.nextInt();
		
		LinkedHashMap<Integer, String> cache = new LinkedHashMap<Integer, String>(capacity,0.75f,true){
			protected boolean removeEldestEntry(Map.Entry<Integer, String>eldest) {
				return size() > capacity;
				
			}
		};
		
		for(int i=0;i<n;i++) {
			cache.put(keys[i][0], values[i]);
		}
		
		System.out.print("[");
		int count = 0;
		for(Map.Entry<Integer, String> entry : cache.entrySet()) {
			System.out.print("("+entry.getKey()+", \""+entry.getValue()+"\")");
			count++;
			if(count<cache.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		sc.close();
	}

}
