package com.hcc.Java8Features.java8;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmployeeImp {
	
	//Using Ternary operator
//	public static List<Employee>la(String s)
//	{
//		return(s.equalsIgnoreCase("tax"))
//				?lst.stream().filter(e->e.EmpSal>20000).map(e->e.EmpName).collect(Collectors.toList())
//				:lst.stream().filter(e->e.EmpSal>20000).map(e->e.EmpName).collect(Collectors.toList());
//	}
	
	public static void main(String[] args) 
	{	
	List<Employee>lst=Arrays.asList(new Employee(1,10000,"sam",10),
			new Employee(2,20000,"ram",19),
			new Employee(3,30000,"shyam",25),
			new Employee(4,40000,"sammy",23)
			);
	
	
	System.out.println("---------------------------List to map-------------------");
	Map<String ,Integer>collect=lst.stream().collect(Collectors.toMap(k->k.getEmpName(),v->v.getEmpSal()));
	System.out.println(collect);
	
	System.out.println("---------------------------Sorted Employee acc to their Name------------------");
	List<Entry<String, Integer>> list2 = collect.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
	System.out.println(list2);


	System.out.println("------------------------Employee desc ssorted by key in LHM-------------------------");
	List<Entry<String, Integer>> list3 = collect.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).toList();
	System.out.println(list3);

	
	System.out.println("------------------------------Startes with letter-------------------------------------- ");
	List<Entry<String, Integer>> list4 = collect.entrySet().stream().filter(e -> e.getKey().startsWith("M")).toList();
	System.out.println(list4);

	long count = collect.entrySet().stream().count();
	System.out.println(count);

	
	System.out.println("-------------------------------------Filters wrt to name and salary :------------------------------------------ ");
	List<Entry<String, Integer>> list5 = collect.entrySet().stream()
			.filter(x -> x.getKey().startsWith("s") && x.getValue() == 20000).toList();
	System.out.println(list5);

	System.out.println("--------------------------------------Employee asc sorted by key in Hashmap :----------------------------------- ");
	HashMap<String, Integer> orderMapKey = new LinkedHashMap<>();
	collect.entrySet().stream().sorted(Map.Entry.comparingByKey())
			.forEachOrdered(x -> orderMapKey.put(x.getKey(), x.getValue()));
	System.out.println(orderMapKey);

	System.out.println("--------------------------Employee asc sorted by Value in LHM :------------------------------------------ ");
	HashMap<String, Integer> orderMapValue = new LinkedHashMap<>();
	collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
			.forEachOrdered(x -> orderMapValue.put(x.getKey(), x.getValue()));
	System.out.println(orderMapValue);

	
	System.out.println("---------------------------------Employee desc ssorted by key in LHM-------------------------------------------");
	HashMap<String, Integer> revOrderKey = new LinkedHashMap<String, Integer>();
	collect.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			.forEachOrdered(x -> revOrderKey.put(x.getKey(), x.getValue()));
	System.out.println(revOrderKey);

	System.out.println("------------------------------------Employee desc ssorted by Value in LHM---------------------------------");
	HashMap<String, Integer> revOrderValue = new LinkedHashMap<String, Integer>();
	collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.forEachOrdered(x -> revOrderValue.put(x.getKey(), x.getValue()));
	System.out.println(revOrderValue);

	System.out.println("-----------------------------------Printed Employee names which had salary greater than 10k :-------------------- ");
	String collect2 = collect.entrySet().stream().filter(k -> k.getValue() > 20000).map(Map.Entry::getKey)
			.collect(Collectors.joining(", "));
	System.out.println(collect2);

	System.out.println("-------------------------- Increase salary of employee had age greater than 23 :------------------------ ");
	List<Employee> list6 = lst.stream().map(x -> {
		if (x.getEmpAge() > 25) {
			x.setEmpSal((int) (x.getEmpSal() * 1.5));
		}
		return x;
	}).toList();
	for(Employee e: list6) {
		System.out.println(e);
	}
	
	//Iterate map 
	System.out.println("-------------------------------Iterate by using for and Map.entry && entryset()------------------------------------");
	for(Map.Entry<String, Integer> e: collect.entrySet()) {
		System.out.println(e);
	}
	
	System.out.println("---------------------- Using Iterator----------------------------------------");
	Iterator<Entry<String, Integer>> i = collect.entrySet().iterator();
	if(i.hasNext()) {
		System.out.println(i.next());
	}
	


 System.out.println("------------------Sorting using comparator-----------------------");
	Collections.sort(lst, new MyComparator());
	
	System.out.println("---------------------------salary greaterthan 20000-------------------");
	System.out.println(lst.stream().filter(e->e.EmpSal>20000).map(e->e.EmpName).skip(1).collect(Collectors.toList()));
	
	lst.stream().sorted(Comparator.comparing(e->e.EmpName)).forEach(System.out::println);
	
	
	List<String>name=new ArrayList<>();
	name=lst.stream().filter(e->e.EmpSal>20000).map(e->e.EmpName).skip(1).collect(Collectors.toList());
	System.out.println(name);
	
	System.out.println(lst.stream().filter(x->x.EmpAge>20).map(x->x.EmpSal).toList());	
	
	



}
}
//System.out.println("--------------Inner class----------------------------");

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.EmpSal-o2.EmpSal;
	}
}
