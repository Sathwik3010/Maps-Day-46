package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employeesss {
	int id;
	String name;
	int salary;
	public Employeesss(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class Main81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<Integer,Employeesss> map = new HashMap<>();
		
		String highestPaidName = " ";
		int maxSalary = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			
			Employeesss emp = new Employeesss(id, name, salary);
			map.put(id, emp);
			
			if(salary>maxSalary) {
				maxSalary = salary;
				highestPaidName = name;
			}
		}
		System.out.println(highestPaidName);
		sc.close();
	}

}
