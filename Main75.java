package com.codegnan.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		int searchKey = sc.nextInt();
		
		if(map.containsKey(searchKey)) {
			System.out.println(map.get(searchKey));
		} else {
			System.out.println("Key not found");
		}
		sc.close();
	}

}
