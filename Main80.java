package com.codegnan.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<size; i++) {
			int num = sc.nextInt();
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int maxFreq = 0;
		int result = Integer.MAX_VALUE;
		
		for(int key : map.keySet()) {
			int freq = map.get(key);
			
			if(freq > maxFreq) {
				maxFreq = freq;
				result = key;
			} else if(freq == maxFreq && key< result) {
				result = key;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}
