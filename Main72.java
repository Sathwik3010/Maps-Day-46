package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int mark = sc.nextInt();
			map.put(mark, map.getOrDefault(mark, 0)+1);
		}
		
		int count = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(count >0) {
				System.out.print(", ");
			}
			System.out.print(entry.getKey()+":"+entry.getValue());
			count ++;
		}
		sc.close();
	}

}
