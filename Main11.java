package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			
			map.put(key, value);
		}

		
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		
		System.out.print("[");
		for(int i=list.size()-1; i>=0; i--) {
			Map.Entry<Integer, String> entry = list.get(i);
			System.out.print("("+entry.getKey()+", \""+ entry.getValue()+"\")");
			
			if(i != 0) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

		sc.close();
	}

}
