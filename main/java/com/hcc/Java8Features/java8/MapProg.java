package com.hcc.Java8Features.java8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MapProg {
//	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//
//		map.put(1, "w");
//		map.put(2, "f");
//		map.put(3, "c");
//		map.put(4, "h");
//
//		Map<Employee, Integer> emp = new HashMap<Employee, Integer>();
//		emp.put(new Employee(1, 10000, "samiksha", 10), 10);
//		emp.put(new Employee(2, 20000, "ramesh", 19), 20);
//		emp.put(new Employee(3, 30000, "shyam", 25), 30);
//		emp.put(new Employee(4, 40000, "sunny", 23), 40);
//
//		System.out.println("---------------------------------------------------------");
//		emp.entrySet().stream()
//		.sorted(Entry.comparingByKey(Comparator.comparing(Employee::getEmpAge).reversed())).forEach(System.out::println);

//
//
//
//		// ways to print map
//		for (Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " : " + m.getValue());
//		}
//
//		map.entrySet().stream().forEach(k -> System.out.println(k));
//		map.forEach((k, v) -> System.out.println(k + " : " + v));
//
//		// sorting by comparator
//
//		List<Entry<Integer, String>> s = new ArrayList<>(map.entrySet());
//		Collections.sort(s, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
//
//		System.out.println(s);
//
//		System.out.println("------------------------------------------");
//		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
//
//		System.out.println("------------------------------------------");
//		map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
//
//
//	}
}
