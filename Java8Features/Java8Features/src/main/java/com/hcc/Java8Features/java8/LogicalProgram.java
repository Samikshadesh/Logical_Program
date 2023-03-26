package com.hcc.Java8Features.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class LogicalProgram {
	public static void main(String[] args) {
//		String s1 = "Samiksha";
//		System.out.println(checkVowels(s1));
//		System.out.println(checkVowelInString(s1) ? "present" : "not present");
//	}
//
//	// using java8 feature
//	private static boolean checkVowelInString(String s1) {
//
//		boolean s = IntStream.range(0, s1.length()).mapToObj(s1::charAt).anyMatch(i -> "aeiouAEIOU".indexOf(i) >= 0);
//		return s;
//	}
//
//	// without using java8 feature
//	private static String checkVowels(String s1) {
//
//
//		for(int i=0;i<s1.length();i++)
//		{
//			if(s1.charAt(i)=='A'|| s1.charAt(i)=='E'|| s1.charAt(i)=='I'|| s1.charAt(i)=='O'|| s1.charAt(i)=='U'|| s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
//			{
//				return "present";
//			}
//		}
//		return "not present";
//	}	}

	// ************* using recursion **************
//	for(
//
//	int i = 0;i<n;i++)
//	{
//		System.out.println(fiboloop(i));
//	}
//
//}
//
//private static int fiboloop(int n) {
//
//	if(n<=1)
//		return n;
//	return fiboloop(n-1)+fiboloop(n-2);
//}
	
	
	// normal way
//	long t=1;
//	for(int i=2;i<=n;i++)
//	{
//		t*=i;
//	}
//	System.out.println(t);
//	
//	//using java8
//	long fact=LongStream.rangeClosed(2, n).reduce(1, (long t1,long t2)-> t1*t2);
//	System.out.println(fact);
//	
//	int fact1=IntStream.rangeClosed(2, n).reduce(1, (int t1, int t2)->t1*t2);
//	System.out.println(fact1);
//}
        Map<Integer, List<String>>m1=new HashMap<>();
        m1.put(1, List.of("aaa", "sss", "bb", "ddd"));
        m1.put(2, List.of("aaa", "sss", "bb", "ddd"));
        
        m1.put(3, List.of("aaa", "sss", "bb", "ddd"));
        m1.put(4, List.of("aaa", "sss", "bb", "ddd"));
        
        m1.entrySet().stream().iterator().forEachRemaining(k->System.out.println(k.getKey()+" : "+k.getValue()));
        
	}}
