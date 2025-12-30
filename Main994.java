package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main994 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hashtable<Integer, Integer> table = new Hashtable<>();
		
		for(int i=0; i<n ; i++) {
			int num = sc.nextInt();
			table.put(num, table.getOrDefault(num, 0)+1);
		}
		
		int maxFreq = 0;
		int result = Integer.MAX_VALUE;
		
		Iterator<Map.Entry<Integer, Integer>> it = table.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			int key = entry.getKey();
			int freq = entry.getValue();
			
			if(freq > maxFreq || (freq == maxFreq && key<result)) {
				maxFreq = freq;
				result = key;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}
