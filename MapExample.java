package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//put(key, value)--> add entries to the map
		Map<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("Arjun", 68);
		studentMarks.put("Ravi", 48);
		studentMarks.put("sita", 91);
		studentMarks.put("ram", 100);
		// putAll(Map m)
		Map<String, Integer> newStudents = new HashMap<>();
		newStudents.put("jeevan", 96);
		newStudents.put("Ananya", 82);
		newStudents.put("meera", 87);
		studentMarks.putAll(newStudents);
		
		// get(key)--> returns the value associate with the key.
		System.out.println("Marks of Arjun: "+studentMarks.get("Arjun"));
		// remove(key)
		System.out.println("Removed Ravi marks: "+studentMarks.remove("Ravi"));
		
		//containskey
		System.out.println("Is sita Present? "+studentMarks.containsKey("sita"));
		//containskey
		System.out.println("Any student scored 100? "+studentMarks.containsValue(100));
		
		System.out.println("is Map Empty? "+studentMarks.isEmpty());
		
		//size()
		System.out.println("total Students: "+studentMarks.size());
		
		//keySet studentNames
		Set<String> studentNames = studentMarks.keySet();
		System.out.println("Student Names: "+studentNames);
		
		//values()--> return all values of a collection.
		Collection<Integer> marks = studentMarks.values();
		System.out.println("Student Marks: "+marks);

		//entrySet
		Set<Map.Entry<String, Integer>> entires = studentMarks.entrySet();
		System.out.println("All entries");
		for(Map.Entry<String, Integer>entry:entires) {
			System.out.println(entry.getKey()+"------->"+entry.getValue());
		}
		
		//clear
		studentMarks.clear();
		System.out.println("Map cleared. is Empty? "+studentMarks.isEmpty());
	}

}
