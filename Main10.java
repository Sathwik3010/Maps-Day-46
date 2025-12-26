package com.codegnan.collectionFramework;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<String, Integer> map = Collections.synchronizedMap(new LinkedHashMap<>());
		
		map.put("Counter", 0);
		
		Runnable task = () -> {
			for(int i=0; i<n; i++) {
				synchronized (map) {
					int value =map.get("Counter");
					map.put("Counter", value+1);
				}
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(map.get("Counter"));
		sc.close();
	}

}
