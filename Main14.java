package com.codegnan.collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();
		
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		
		int[] keys = new int[n];
		String[] values = new String[n];
		
		for(int i=0; i<n; i++) {
			keys[i]= sc.nextInt();
			values[i]=sc.next();
		}
		
		int capacity = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int key = keys[i];
			String value = values[i];
			
			freqMap.put(key, freqMap.getOrDefault(keys, 0)+1);
			
			cache.put(key, value);
			
			if(cache.size() > capacity) {
				
				int minFreq = Integer.MAX_VALUE;
				for(int k : cache.keySet()) {
					minFreq = Math.min(minFreq, freqMap.get(k));
				}
				
				for(int k : cache.keySet()) {
					if(freqMap.get(k)==minFreq) {
						cache.remove(k);
						break;
					}
				}
			}
		}
		
		System.out.print("[");
		int count = 0;
		for(Map.Entry<Integer, String> e: cache.entrySet()) {
			if(count > 0)
				System.out.print(", ");
			System.out.print("(" + e.getKey() + ", \"" + e.getValue() + "\")");
			count ++;
		}
		System.out.print("]");
		sc.close();
	}

}
