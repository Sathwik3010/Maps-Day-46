package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		int count = 0;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(count>0) {
				System.out.print(", ");
			}
			System.out.print(entry.getKey()+":"+entry.getValue());
			count++;
		}
		sc.close();
	}

}
