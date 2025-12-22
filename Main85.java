package com.codegnan.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main85 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		HashMap<Integer, String> map1 = new HashMap<>();
		for(int i=0; i<n1; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map1.put(key, value);
		}
		int n2 = sc.nextInt();
		HashMap<Integer, String> map2 = new HashMap<>();
		for(int i=0; i<n2; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map2.put(key, value);
		}

		if(map1.equals(map2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

}
