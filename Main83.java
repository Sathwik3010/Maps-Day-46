package com.codegnan.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			int value = sc.nextInt();
			map.put(key, value);
		}
		
		int sum=0;
		Collection<Integer> marks = map.values();
		for(int total: marks) {
			sum+=total;
		}
		System.out.println(sum);
		sc.close();
	}

}
