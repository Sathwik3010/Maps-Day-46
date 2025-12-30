package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		Hashtable <Character, Integer> table = new Hashtable<>();
		for(char ch : line.toCharArray()) {
			table.put(ch, table.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: table.entrySet()) {
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
		}
		sc.close();
	}

}
