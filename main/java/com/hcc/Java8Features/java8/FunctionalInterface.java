package com.hcc.Java8Features.java8;
public interface FunctionalInterface {
	//Functional Interface contain only one abstract method n number of default and static methods
	int add(int a, int b);
	default String nameIs()
	{
		return"Samiksha";
	}

	default void addition(int a, int b){
		int c =a+b;
	}
	
	default Integer SumOfArray(int x, int y) 
	{
		return x+y;
	}
	
	static Integer MulResult(int d, int g)
	{
		return d*g;
	}

}
//we are not writing class implemets FunctionalInterface here
class FunctionalInterfaceImpl{
	
	public static void main(String[] args)
	{
		FunctionalInterface intface=(a,b)->a+b;
		System.out.println(FunctionalInterface.MulResult(2,5));
	    System.out.println(intface.nameIs());
		System.out.println(intface.add(10, 10));
	}
	
}
