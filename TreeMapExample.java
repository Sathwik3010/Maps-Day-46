package com.codegnan.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		HashMap<Person, Integer> h = new HashMap<>();
		h.put(new Person(1, "dev", "psdev2002@gmail.com"),666);
		h.put(new Person(7, "Ramu", "ram@gmail.com"),556);
		h.put(new Person(5, "Kiran", "ki@gmail.com"),686);
		h.put(new Person(3, "Manas", "manas@gmail.com"),222);
		h.put(new Person(4, "moulika", "mouli@gmail.com"),444);
		h.put(new Person(2, "divya", "diya@gmail.com"),333);
		System.out.println(h);
		System.out.println("Printing Entires One by One");
		for(Map.Entry<Person, Integer>entry: h.entrySet()) {
			System.out.println(entry.getKey()+"====>"+entry.getValue());
		}
		
		LinkedHashMap<Person, Integer> h1 = new LinkedHashMap<>();
		h1.put(new Person(1, "dev", "psdev2002@gmail.com"),666);
		h1.put(new Person(7, "Ramu", "ram@gmail.com"),556);
		h1.put(new Person(5, "Kiran", "ki@gmail.com"),686);
		h1.put(new Person(3, "Manas", "manas@gmail.com"),222);
		h1.put(new Person(4, "moulika", "mouli@gmail.com"),444);
		h1.put(new Person(2, "divya", "diya@gmail.com"),333);
		System.out.println(h1);
		System.out.println("Printing Entires One by One");
		for(Map.Entry<Person, Integer>entry: h1.entrySet()) {
			System.out.println(entry.getKey()+"====>"+entry.getValue());
		}
		
		TreeMap<Person, Integer> h2 = new TreeMap<>(new CustomComparator());
		h2.put(new Person(1, "dev", "psdev2002@gmail.com"),666);
		h2.put(new Person(7, "Ramu", "ram@gmail.com"),556);
		h2.put(new Person(5, "Kiran", "ki@gmail.com"),686);
		h2.put(new Person(3, "Manas", "manas@gmail.com"),222);	
		System.out.println(h2);
		System.out.println("Printing Entires One by One");
		for(Map.Entry<Person, Integer>entry: h2.entrySet()) {
			System.out.println(entry.getKey() + "====>"+entry.getValue());
		}
//		Map<String, String> map = new TreeMap<>();
//		map.put("AAA", "111");
//		map.put("BBB", "222");
//		map.put("CCC", "333");
//		map.put("DDD", "444");
//		System.out.println(map);
	}

}
