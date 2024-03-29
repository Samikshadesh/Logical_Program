package com.hcc.Java8Features.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

	public static void main(String[] args) {

		List<Integer>ls=Arrays.asList(1,2,4,6,5);
		//List<Integer>newLs = ls.stream().reduce(1,a->a*a);

		List<Integer>ls1 = Arrays.asList(1,2,3,4,7,8,6,5);
		Optional<Integer>llll= ls1.stream().reduce(Integer::max);
		System.out.println("MaxElem: "+llll);

		List<Integer>list=Arrays.asList(1,2,3,4);
		list.stream().forEachOrdered(System.out::println);
		
		Integer n=list.stream().reduce(1, (a,b)->a*b);
		System.out.println(n);
		System.out.println("-----------------reduce method o/p------------------");
		
		Optional<Integer>e=list.stream().reduce(Integer::max);
		System.out.println(e);
		
		list.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println("------------------------------------------");
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(1, 10).forEachOrdered(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Time Taken: "+(end-start));
		
		
		IntStream.range(1, 10).forEachOrdered(System.out::println);
		
		List<String>lls=Arrays.asList("sam","sammy","Samiksha");
		Optional<String> w=lls.stream().reduce((a,b)->a.length()>b.length()?a:b);
		System.out.println(w.get());
		
		//normal stream
		System.out.println("------------------------------------------");
		IntStream.range(1, 10).parallel().forEach(x->{
		System.out.println("Thread: "+Thread.currentThread().getName()+" : "+x);
		});
		
		//parallel stream
		IntStream.range(1, 10).forEach(x->{
			System.out.println("Thread: "+Thread.currentThread().getName()+" : "+x);
			});
		
		
		List<String>l=Arrays.asList("123","234","567");
		List<Integer>newL=l.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(newL);
		
		//list.forEach(v->System.out.println(Integer.parseInt("v")));
		
		
		//List sorting
		
		System.out.println("------------------------------------------");
		List<Integer>lstSort=Arrays.asList(23,6,89,56,1,8);
		Collections.sort(lstSort);
		Collections.reverse(lstSort);
		
		List<Integer>sls = lstSort.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//Decending order
		System.out.println(sls);
		lstSort.stream().sorted().collect(Collectors.toList());//Ascending order


		
		
		int[] a= {1,2,80,4,5};
		int[] b= {1,2,80,4,5};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(a.equals(b));
		System.out.println("a and b array are ");
		System.out.println(Arrays.equals(a, b)?"same\n":"not same\n");
		
	}

}
