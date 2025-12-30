package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main993 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hashtable<Integer, Integer> table = new Hashtable<>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			int value = sc.nextInt();
			table.put(key, value);
		}
		
		int sum=0;
		for(int val: table.values()) {
			sum+=val;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
