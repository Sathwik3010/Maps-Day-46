package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main99 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        Hashtable<Integer, String> table = new Hashtable<>();
	        
	        for(int i=0; i<n; i++) {
	        	  int id = sc.nextInt();
	              String name = sc.next();
	              table.put(id, name);
	        }
	        
	        int keyToUpdate = sc.nextInt();
	        String newValue = sc.next();
	        
	        if(table.containsKey(keyToUpdate)) {
	        	table.put(keyToUpdate, newValue);
	        }
	        
	        Iterator<Map.Entry<Integer, String>> it = table.entrySet().iterator();
	        while(it.hasNext()) {
	            Map.Entry<Integer, String> entry = it.next();
	            System.out.print(entry.getKey()+" "+entry.getValue());
	            if(it.hasNext()) {
	            	System.out.print(" ");
	            }
	        }
	        sc.close();
	}

}
