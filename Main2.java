package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<size; i++) {
			int num = sc.nextInt();
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int count = 0;
		for(var entry : map.entrySet()) {
			System.out.print(entry.getKey()+":"+entry.getValue());
			count ++;
			if(count < map.size()) {
				System.out.println(", ");
			}
		}
		sc.close();
	}

}
