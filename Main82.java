package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list);
		
		System.out.println(list);
		sc.close();
	}

}
