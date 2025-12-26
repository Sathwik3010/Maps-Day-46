package com.codegnan.collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : line.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			if(it.hasNext()) {
				System.out.print(", ");
			}
		}
		sc.close();
	}

}
