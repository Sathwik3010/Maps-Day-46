package com.codegnan.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main79 {

	static Map<String, Integer> counterMap = Collections.synchronizedMap(new HashMap<>());
	
	static class Worker extends Thread{
		private int n;

		public Worker(int n) {
			super();
			this.n = n;
		}
		
		@Override
		public void run() {
			for(int i=0; i<n; i++) {
				synchronized (counterMap) {
					int current = counterMap.get("count");
					counterMap.put("count", current+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		counterMap.put("count", 0);
		
		Thread t1 = new Worker(n);
		Thread t2 = new Worker(n);

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
		
		System.out.println(counterMap.get("count"));
		sc.close();
	}

}
