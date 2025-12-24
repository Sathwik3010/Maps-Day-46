package com.codegnan.collectionFramework;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		for(int i=0;i<n; i++) {
			int rollno = sc.nextInt();
			String section = sc.next();
			map.put(rollno, section);
		}
		
		int searchKey = sc.nextInt();
		
		System.out.println(map.containsKey(searchKey));
		sc.close();
	}

}
