package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Hashtable<Integer, String> table = new Hashtable<>();
		
		for(int i=0; i<n;i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table.put(key, value);
		}
		
		int removeId = sc.nextInt();
		
		table.remove(removeId);
		
		Iterator<Map.Entry<Integer, String>> it = table.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry= it.next();
			System.out.print(entry.getKey()+" "+entry.getValue());
			if(it.hasNext()) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
