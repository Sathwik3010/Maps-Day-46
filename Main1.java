package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		for(int i=0;i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		
		for(int key : map.keySet()) {
			System.out.print(key+" ");
		}
		sc.close();
	}

}
