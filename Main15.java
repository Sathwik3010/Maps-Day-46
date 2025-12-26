package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        // Step 1: Store data in LinkedHashMap (preserves insertion order)
	        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

	        for (int i = 0; i < n; i++) {
	            int key = sc.nextInt();
	            String value = sc.next();
	            map.put(key, value);
	        }
	        
	        System.out.print("[");
	        int count =0;
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	        	System.out.print("("+ entry.getKey() + ", \"" + entry.getValue() + "\")");
	        	
	        	if(++count < map.size()) {
	        		System.out.print(", ");
	        	}
	        }
	        System.out.println("]");
	        sc.close();
	}

}
