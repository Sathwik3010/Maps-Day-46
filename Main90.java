package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hashtable<Integer, String> table = new Hashtable<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			table.put(id, name);
		}
		
		int count = 0;
		for(Integer key : table.keySet()) {
			System.out.print(key);
			if(count < table.size() - 1) {
				System.out.print(" ");
			}
			count++;
		}
		sc.close();
	}

}
