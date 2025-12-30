package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

public class Main992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		Hashtable<Integer, String> table1 = new Hashtable<>();
		for(int i=0; i<n1; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			table1.put(key, value);
		}
		
		int n2 = sc.nextInt();
        Hashtable<Integer, String> table2 = new Hashtable<>();
        for (int i = 0; i < n2; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            table2.put(key, value);
        }
        
        if(table1.equals(table2)) {
        	System.out.println("TRUE");
        } else {
        	System.out.println("FALSE");
        }
		sc.close();
	}

}
