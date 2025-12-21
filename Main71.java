package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<Integer, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			map.put(id, name);
		}
		
//		Set<Integer> key = map.keySet();
//		System.out.println("Key"+key);
		for(Integer key : map.keySet()) {
			System.out.print(key);
				if(map.size()>1) {
					System.out.print(" ");
				}
		}
		sc.close();
	}

}
