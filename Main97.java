package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.next();
		Hashtable<Character, Integer> table = new Hashtable<>();
		for(char ch: line.toCharArray()) {
			table.put(ch, table.getOrDefault(ch, 0)+1);
		}
		
		char result = 0;
		boolean found = false;
		
		for(char ch : line.toCharArray()) {
			if(table.get(ch) == 1) {
				result = ch;
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(result);
		} else {
			System.out.println(-1);
		}
		sc.close();
	}

}
