package com.codegnan.collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Student{
	int id;
	String name;
	int grade;
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
}
public class Main98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hashtable<Integer, Student> table = new Hashtable<>();

		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int grade = sc.nextInt();
			
			table.put(id, new Student(id, name, grade));
		}
		
		Iterator<Map.Entry<Integer, Student>> it = table.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Student> entry = it.next();
			System.out.print(entry.getValue().name);
			if(it.hasNext()) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
